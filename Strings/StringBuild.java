public class StringBuild {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbuff = new StringBuffer("String");
        for (int i = 0; i < 1000; i++) {
            // sbuff.append("(～￣▽￣)~");
            System.out.println(sbuff);
        }

        long firsttime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        StringBuilder sbuild = new StringBuilder("String");
        for (int i = 0; i < 1000; i++) {
            // sbuild.append("(T_T)");
            System.out.println(sbuild);
        }

        long secondtime = System.currentTimeMillis() - startTime;
        System.out.println("StringBuilder: " + secondtime + "ms\nStringBuffer: " + firsttime + "ms");

    }
}
