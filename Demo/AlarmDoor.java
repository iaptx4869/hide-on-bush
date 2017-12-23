interface Alarm {
    void alarm();
}
 
abstract class Door {
    abstract void open();
    abstract void close();
}
 
class AlarmDoor extends Door implements Alarm {
    void open() {
      System.out.println("open");
    }
    void close() {
      System.out.println("close");
    }
    public void alarm() {
      System.out.println("alarm");
    }
}

class AlarmDoor{
    public static void main(String[] args){
        AlarmDoor ad=new AlarmDoor();
        ad.open();
        ad.close();
        ad.alarm();
    }
}