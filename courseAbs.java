abstract  class courseAbs {
    courseAbs(){
        System.out.println("enrolled in programming course:");

    }
    abstract void programming();
    public void learn(){
        System.out.println("learning programming ");
    }
    
}
class IT extends courseAbs{
    void programming(){
        System.out.println("c,c++,java");
    }
}
class mains{
    public static void main(String[] args) {
        courseAbs a_b = new IT();
        a_b.programming();
        a_b.learn();
    }
}

