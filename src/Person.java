public class Person implements Comparable<Person> {
    private String firstName, lastName;
    private int id;

    static private int population; // Class Variable vs instance variable

    public Person()
    {
        Person.population++;
    }

    public static int getPopulation(){return population;}

    protected void finalize() // NOT final, NOT finally
    {
        Person.population--;
    }

    @Override
    public int compareTo(Person that) {
        int cmp = this.lastName.compareTo(that.lastName);
        if (cmp != 0)
            return cmp;

        cmp = this.firstName.compareTo(that.firstName);
        if (cmp != 0)
            return cmp;

        return this.id - that.id;
    }
}
