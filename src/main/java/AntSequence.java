public class AntSequence {
    static void printSeq(StringBuilder ant) {
        buildSeq(ant);
        System.out.println(ant);
    }

    static StringBuilder buildSeq(StringBuilder str) {
        if (str.length() < 2) {
            str.append("1");
            return str;
        } else {
            for (int i = 0; i < str.length(); i += 2) {
                if (str.charAt(i) == str.charAt(i+1)){
                    str.replace(i, i+2, "2");
                    str.insert(i, "1");
                } else {
                    str.insert(i+1, "1");
                    str.insert(i+3, "1");
                    i += 2;
                }
            }
            return str;
        }
    }
}
