public enum Days {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    private Days(int day){
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }


}
