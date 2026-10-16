class StringReverse {
    static int totalReversals = 0;

    void reverse(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        totalReversals++;

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        StringReverse s = new StringReverse();

        s.reverse("Java");

        System.out.println("Total Reversals = " + totalReversals);
    }
}