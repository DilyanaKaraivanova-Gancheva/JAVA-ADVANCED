import java.util.*;

public class I_UserLogs09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> usernamesIp = new TreeMap<>();
        Map<String, Integer> ipCounts = new LinkedHashMap<>();

        String[] input = scan.nextLine().split(" ");

        while (true) {
            if ("end".equals(input[0])) {
                break;
            }

            String[] tokensIp = input[0].split("=");
            String ip = tokensIp[1];

            String[] tokensUser = input[2].split("=");
            String username = tokensUser[1];

            if (!usernamesIp.containsKey(username)) {
                usernamesIp.put(username, new ArrayList<>());
                usernamesIp.get(username).add(ip);
                if (!ipCounts.containsKey(ip)) {
                    ipCounts.put(ip, 1);
                } else {
                    ipCounts.put(ip, ipCounts.get(ip) + 1);
                }
            } else {
                if (usernamesIp.get(username).contains(ip)) {
                    ipCounts.put(ip, ipCounts.get(ip) + 1);
                } else {
                    usernamesIp.get(username).add(ip);
                    ipCounts.put(ip, 1);
                }
            }
            input = scan.nextLine().split(" ");
        }
        int count = 0;
        for (String s : usernamesIp.keySet()) {
            System.out.printf("%s: %n", s);
            for (String ips : usernamesIp.get(s)) {
                if (ipCounts.containsKey(ips)) {
                    count++;
                    if (count < usernamesIp.get(s).size()) {
                        System.out.printf("%s => %d, ", ips, ipCounts.get(ips));
                    } else {
                        System.out.printf("%s => %d.%n", ips, ipCounts.get(ips));
                    }
                }
            }
        }
    }
}
