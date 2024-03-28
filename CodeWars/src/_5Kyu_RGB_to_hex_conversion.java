public class _5Kyu_RGB_to_hex_conversion {
    public static String rgb(int r, int g, int b) {
        StringBuilder RGB = new StringBuilder("");
        if (r > 255){r = 255;}
        if (r < 0){r = 0;}
        if (g > 255){g = 255;}
        if (g < 0){g = 0;}
        if (b > 255){b = 255;}
        if (b < 0){b = 0;}

        String hexR = Integer.toHexString(r).toUpperCase();
        String hexG = Integer.toHexString(g).toUpperCase();
        String hexB = Integer.toHexString(b).toUpperCase();

        if (hexR.length() < 2){
            hexR = 0 + hexR;
        }
        if (hexG.length() < 2){
            hexG = 0 + hexG;
        }
        if (hexB.length() < 2){
            hexB = 0 + hexB;
        }

        RGB.append(hexR + hexG + hexB);

        return RGB.toString();
    }
}
