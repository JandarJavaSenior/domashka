
class Sezon {
    public String nomSez(int sez) {
        if (sez == 12 || sez == 1 || sez == 2) {
            return "zima";
        } else if (sez == 3 || sez == 4 || sez == 5) {
            return "vesna";
        } else if (sez == 6 || sez == 7 || sez == 8) {
            return "leto";
        } else if (sez == 9 || sez == 10 || sez == 11) {
            return "osen";
        } else {
            return "vvedi pravilno lashok";
        }
    }
}

