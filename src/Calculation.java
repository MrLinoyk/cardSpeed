public class Calculation extends StartMain {

    void setGraphic () {
        setMinGraphic(1500);
        setMaxGraphic(2250);
        setMemoryWeight((getMaxGraphic() - getMinGraphic()) / 3); //2250 - 1500 = 750 / 3 = 250
        //memoryWeight = (getMaxGraphic() - getMinGraphic()) / 3;
        setMemoryClock(getMinGraphic() + getMemoryWeight()); // 1750
        setLastMemoryClock(getMemoryClock()); // 1750

    }
    void defaultMemoryWeight () {
        setMemoryWeight(100); // 100
    }


   /* void findPlusMemory () {
       setMemoryClock((getMemoryWeight()) + getLastMemoryClock());

    } */

    //сложение Mhs
    void  additionMhs() {
        do {
            setMemoryClock(getMemoryClock() + getMemoryWeight()); // 1850
            setLastMhs(getLastMhs() + 1f); // для проверки

        } while (getLastMhs() < getMhs() && getLastMemoryClock() < getMinGraphic() && getLastMemoryClock() > getMaxGraphic());
        setLastMemoryClock(getMemoryClock());
        System.out.println("LastMemoryClock = " + getLastMemoryClock());

    }



    // вычитание Mhs
    void subtractionMhs () {

        setMemoryWeight(getMemoryWeight() / 3);


        do {
            setMemoryClock(getLastMemoryClock() - getMemoryWeight());
        } while (getLastMhs() < getMhs() && getLastMemoryClock() < getMinGraphic() && getLastMemoryClock() > getMaxGraphic());

        setLastMemoryClock(getMemoryClock());
        setMemoryWeight(getMemoryWeight() / 3);

    }

    void setValues () {
        setGraphic();
        defaultMemoryWeight();
        setMinCoreGraph(1000);
        setMaxCoreGraph(1200);
        setCoreWeight(50);
        setCoreClock(getMinCoreGraph() + getCoreWeight());
    }

    public void additionCore () {
        do {
            setCoreClock(getCoreClock() + getCoreWeight()); // 1100
            additionMhs();
            subtractionMhs();
        } while (getLastMhs() < getMhs() && getCoreClock() < getMinCoreGraph() && getCoreClock() > getMaxCoreGraph());

    }

    void subtractionCore () {

        setCoreWeight(getCoreWeight() / 3);
        do {
            setCoreClock(getCoreClock() - getCoreWeight()); // 1083
            additionMhs();
            subtractionMhs();

        } while (getLastMhs() < getMhs() && getCoreClock() < getMinCoreGraph() && getCoreClock() > getMaxCoreGraph());

    }

}
