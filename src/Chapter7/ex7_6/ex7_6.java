package Chapter7.ex7_6;

import java.util.*;

//도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고,
// 도시 이름을 '키'로 하는 HashMap<String, Location> 컬렉션을 만들고,
//사용자로부터 입력 받아 4개의 도시를 저장하라. 그리고 도시 이름으로 검색하는 프로그램을 작성하라.
//도시, 경도, 위도를 입력하세요.
//>> 서울, 37, 126
//>> LA, 34, -118
//>> 파리, 2, 48
//>> 시드니, 151, -33
//----------------------------------
//서울 37 126
//LA 34 -118
//파리 2 48
//시드니 151 -33
//----------------------------------
//도시 이름 >> 피리
//피리는 없습니다.
//도시 이름 >> 파리
//파리 2 48
//도시 이름 >> 그만
public class ex7_6 {
    static class Location {
        private String city;
        private int latitude;
        private int longtitude;

        public Location(String city, int latitude, int longtitude) {
            this.city = city;
            this.latitude = latitude;
            this.longtitude = longtitude;
        }

        public String getCity() {
            return city;
        }

        public int getLatitude() {
            return latitude;
        }

        public int getLongtitude() {
            return longtitude;
        }

        public void findCity(String city) {
            if (city.equals(this.city))
                System.out.println(this.city + " " + this.latitude + " " + this.longtitude);
        }
    }

    public static void main(String[] args) {
        Location[] locations = new Location[4];
        HashMap<String, Location> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i = 0; i < locations.length; i++) {
            try {
                System.out.print(">> ");
                String text = sc.nextLine();
                StringTokenizer st = new StringTokenizer(text, ", ");
                String city = st.nextToken().trim();
                int latitude = Integer.parseInt(st.nextToken().trim());
                int longtitude = Integer.parseInt(st.nextToken().trim());
                locations[i] = new Location(city, latitude, longtitude);
                hashMap.put(city, locations[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        Set<String> key = hashMap.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.println("--------------------");
            Location l = hashMap.get(city);
            System.out.println(l.getCity() + " " + l.getLatitude() + " " + l.getLongtitude());
        }
        System.out.println("--------------------");
        while (true) {
            try {
                System.out.print("도시 이름 >> ");
                String city = sc.next();
                if (city.equals("그만")) {
                    break;
                }
                Location l = hashMap.get(city);
                if (l == null) {
                    System.out.println(city + "는 없습니다");
                } else {
                    l.findCity(city);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

