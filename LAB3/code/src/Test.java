import java.util.LinkedList;
public class Test 
{
    public static void main(String[]args)
    {
        //Read Regions.xml
        LinkedList<Region> regions;
        regions = new LinkedList<Region>();
        LinkedList< String[] > r = Utility.readXML( "region" );
        int i = 0,j=0;
        LinkedList<City> cities = new LinkedList<City>();
        LinkedList<City> all_Cities = new LinkedList<City>();
        Region region;
        City city;
        String name;
        int population;
            
        for(String[] re: r)
        {
            while(i<re.length)
            {
                
                if(i==0)j=(re.length)/2+1;         
                else if(i<(re.length)/2+1)  
                {
                    name = re[i];
                    population = Integer.parseInt(re[j]);
                    j++;
                    city = new City(name,population);
                    cities.add(city);
                    all_Cities.add(city);
                }
                i++;
            }
            region = new Region(re[0]);
                region.setCities(cities);
                regions.add(region);
                cities.clear();
                i=0;
                j=0;
        }

        //Read Headquarter.xml
        Organization organization = new Organization("Oriols");
        LinkedList< String[] > h = Utility.readXML( "headquarter" );
        Headquarter headquarter;
        i=0;
        for(String[] he: h)
        {
            headquarter = new Headquarter(he[0], he[1], organization);
            while(i<he.length)
            {

                if(i>1)
                {
                    city = Utility.getObject(he[i], all_Cities);
                    headquarter.addCity(city);
                    city.addHQ(headquarter);
                }

                i++;
            }
            i=0;
            organization.addPlace(headquarter);
        }

        //Read Heads.xml
        LinkedList< String[] > ha = Utility.readXML( "head" );

        LinkedList<Delegate> delegates = new LinkedList<Delegate>();
        Delegate delegate;
        Availablity availablity;
        LinkedList<Integer> l_hours = new LinkedList<Integer>();
        LinkedList<String> l_days = new LinkedList<String>();
        int phone;
        int hour;
        i = 0;
        String[] days;
        String[] hours;
        for(String[] hd: ha)
        {
            phone = Integer.parseInt(hd[1]);
            headquarter = organization.getHeadquarter(hd[3]);
            delegate = new Delegate(hd[0], phone, hd[2], headquarter);
            days = hd[4].split("\\.");
            while(i<days.length)
            {
                l_days.add(days[i]);
                i++;
            }
            i=0;
            hours = hd[5].split("\\.");
            while(i<hours.length)
            {
                hour = Integer.parseInt(hours[i]);
                l_hours.add(hour);
                i++;
            }
            i=0;
            availablity = new Availablity(l_days, l_hours);
            delegate.SetAvailablity(availablity);
            l_days.clear();
            l_hours.clear();
            delegates.add(delegate);
        }
        System.out.println("HEADQUARTERS ");
        System.out.println( organization.getHList());
        
    }
}
