public class Engine {
    Operator m = new EngineOperator();
    public void operator() {
         m.turnON();
         m.turnOFF();
    }
}
