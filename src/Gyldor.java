class Gyldor {
    String gylName;
    int svejostl;
    int sena;

    public Gyldor(String gylName, int svejostl, int sena) {
        this.gylName = gylName;
        this.svejostl = svejostl;
        this.sena = sena;
    }

    public static String dvejost(Gyldor[] gyldor) {
        int maxSvejostl = gyldor[0].svejostl;
        String freshe = gyldor[0].gylName;

        for (int i = 1; i < gyldor.length; i++) {
            if (gyldor[i].svejostl > maxSvejostl) {
                maxSvejostl = gyldor[i].svejostl;
                freshe = gyldor[i].gylName;
            }
        }

        return "Самый свежий цветок: " + freshe + " с оценкой свежести " + maxSvejostl + " из 10";
    }

    public static String sena(Gyldor[] gyldor) {
        int maxSena = gyldor[0].sena;
        String dorogo = gyldor[0].gylName;
        for (int i = 1; i < gyldor.length; i++) {
            if (gyldor[i].sena > maxSena) {
                maxSena = gyldor[i].sena;
                dorogo = gyldor[i].gylName;
            }
        }
        return "Cамый дорогой цеток: "+ dorogo+" цена: "+maxSena;
    }

    public static String namee(Gyldor[] gyldor) {
        String maxName = gyldor[0].gylName;
        for (int i = 1; i < gyldor.length; i++) {
            if (gyldor[i].gylName.compareTo(maxName) > 0) {
                maxName = gyldor[i].gylName;
            }
        }
        return "Самое кароткое название: "+maxName;
    }
}


