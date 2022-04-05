import collections.*;

public class Main {
    public static void main(String[] args) {
        CatFact catFact = new CatFact();
        GitHub gitHub = new GitHub();

        System.out.println("Displaying data from multiple API calls.");
        System.out.println(catFact.getCatFacts());
        System.out.println(gitHub.getGitHubInfo());
    }
}
