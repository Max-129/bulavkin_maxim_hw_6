public class Skeleton extends Boss {
    private int skeletonArrows;

    public int getskeletonArrows() {
        return skeletonArrows;
    }

    public void setskeletonArrows(int arrows) {
        this.skeletonArrows = skeletonArrows;

    }

    public Skeleton(int skeletonArrows) {
        this.skeletonArrows = skeletonArrows;
    }

    public String printInfo1() {
        return " Sans HP: " + getHealthPointBoss() + " Damage: " + getDamageBoss() + " Number of arrows: " +
                getDefenseBoss() + " количество стрел: " + this.getskeletonArrows();
    }

    public String printInfo2() {
        return " Papyrus: HP " + getHealthPointBoss() + " Damage: " + getDamageBoss() + " Number of arrows: " +
                getDefenseBoss() + " количество стрел: " + this.getskeletonArrows();
    }
}
