class zad1 implements Runnable {
     int start;
     int koniec;
    public zad1(int start, int end) {
        this.start = start;
        this.koniec = end;
    }
    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= koniec; i++) {
            sum += i;
        }
        double average = (double) sum / (koniec - start + 1);
        System.out.println("Suma: " + sum + " Średnia: " + average);

    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] watki = new Thread[10];
        int start = 1;
        int end = 10;
        for (int i = 0; i < 10; i++) {
            watki[i] = new Thread(new zad1(start, end));
            start = end + 1;
            end = end + 10;
        }
        for (int i = 0; i < 10; i++) {
            watki[i].start();
        }
        for (int i = 0; i < 10; i++) {
            watki[i].join();
        }
        }
    }



