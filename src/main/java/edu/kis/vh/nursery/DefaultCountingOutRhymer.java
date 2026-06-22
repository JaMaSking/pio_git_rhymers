package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje mechanizm wyliczanki.
 * Zapewnia podstawową funkcjonalność dodawania i odczytywania liczb
 * z wykorzystaniem struktury danych opartej na stosie (LIFO).
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_INDICATOR = -1;
    private static final int FULL_INDICATOR = MAX_SIZE - 1;
    private static final int IF_EMPTY_STACK = -1;

    private final int[] numbers = new int[MAX_SIZE];
    private int total = IF_EMPTY_STACK;

    /**
     * Dodaje nową wartość na wierzchołek stosu, o ile nie osiągnięto jego maksymalnej pojemności.
     * * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy w stosie nie ma aktualnie żadnych elementów.
     * * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    // TODO: Rozważyć zmianę nazwy metody na bardziej standardową, np. isEmpty()
    public boolean callCheck() {
        return total == IF_EMPTY_STACK;
    }

    /**
     * Sprawdza, czy stos jest pełny i nie może przyjąć nowych elementów.
     * * @return true, jeśli stos jest pełny, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == FULL_INDICATOR;
    }

    /**
     * Zwraca ostatnio dodaną wartość ze stosu bez jej usuwania.
     * * @return ostatnia wartość na stosie lub wskaźnik błędu w przypadku pustego stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total];
    }

    /**
     * Pobiera i usuwa ostatnio dodaną wartość z wierzchołka stosu.
     * * @return pobrana wartość lub wskaźnik błędu w przypadku pustego stosu
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_INDICATOR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}