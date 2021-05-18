public class Main {

    public static void main(String[] args) {
        new Main();

    }

    public static void calcOne(){
        java.util.List<Integer> teiler = java.util.List.of(7);
        java.util.stream.IntStream.rangeClosed(1, 10000)
                .forEach(i -> System.out.println(i + " teilbar durch "
                        + teiler.stream().filter(j -> i % j == 0)
                        .map(String::valueOf)
                        .collect(java.util.stream.Collectors.joining(", "))));
    }

    public void Main(){
        NumberSelector numberSelector = new NumberSelector(){
            @Override
            public boolean findFirst(NumberSelector select, int value) {
                return false;
            }
        };
    }
}
