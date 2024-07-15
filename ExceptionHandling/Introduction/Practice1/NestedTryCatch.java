package Introduction.Practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NestedTryCatch {

    public static void main(String[] args) {
        try {
            Optional<String> pass = getPass("s3");
            if (pass.isEmpty()) {
                System.out.println("Invalid user name");
                return;
            }

            System.out.println(pass.get().charAt(0));
        } catch (Exception n) {


        }

    }

    public static Optional<String> getPass(String user) {
        Map<String, String> map = new HashMap<>();
        map.put("s1", "s1");
        map.put("s2", "s2");
        String password = map.get(user);
        return password == null ? Optional.empty() : Optional.of(password);
    }
}



