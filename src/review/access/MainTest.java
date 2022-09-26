package access;

import accother.Access;

public class MainTest extends Access {
    public static void main(String[] args) {
        Access acc = new Access();
        // acc.a = "private change";
        // acc.b = "public change";
        // acc.c = "protected change";
        // acc.d = "default change";

        acc.output();
    }
}
