package pl.sda.Zad_Stos;

public class Stos {
    static int head=-1;  // stos jest pusty
    private Integer[] sts= new Integer[10];

    public int peek() {
        return head;
    }

    // konstruktor
    public Stos() {

    }

    public void push(Integer el){
        head++;
        sts[head] = el;

    } // push()

    public Integer value(int poz){
        // nie ma sprawdzenia, czy poz nie jest wyżej głowy (head)
        return sts[poz];
    }

    public Integer pop(){
        Integer temp = 0;
        if (head > -1) {
            temp = sts[head];
            sts[head] = 0;
            head--;
        } // if
        return temp;
    } // pop()  -->> zwraca wartość usuwanego elementu

    public boolean isEmty(){
        if(head > -1 ) return false;
        return  true;
    } // isEmty()

} // class Stos
