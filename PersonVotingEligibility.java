class PersonVotingEligibility {
    String name;
    int age;

    static String country = "India";

    void checkVoting() {
        String personName = name;
        int personAge = age;

        System.out.println("Name: " + personName);
        System.out.println("Country: " + country);

        if (personAge >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

    public static void main(String[] args) {
        PersonVotingEligibility p = new PersonVotingEligibility();

        p.name = "Rahul";
        p.age = 20;

        p.checkVoting();
    }
}