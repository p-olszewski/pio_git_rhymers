package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

//Skrót klawiszowy alt+strzałka pozwala przełączać się między uruchomionymi plikami. W edytorze Visual Studio Code natomiast przełączanie następuje w kolejności ostatnio otwieranych plików (a nie w kolejnosci w jakiej wystepuja na pasku uruchomionych plikow)