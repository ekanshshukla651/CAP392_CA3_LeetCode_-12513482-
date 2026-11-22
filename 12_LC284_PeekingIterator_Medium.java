class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        nextElement = iterator.hasNext() ? iterator.next() : null;
    }

    public Integer peek() {
        return nextElement;
    }
    public Integer next() {
        Integer result = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return result;
    }
    public boolean hasNext() {
        return nextElement != null;
    }
}
