public class Tshirts {
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assert "S".equals(size(37));
        assert "M".equals(size(40));
        assert "L".equals(size(43));
        System.out.println("All is well (maybe!)");
    }
}
