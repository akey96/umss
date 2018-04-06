package bo.edu.umss.programming.exercise2.solution2;

public class SiteFactory {
    public static Site getSite(Class clazz) throws InstantiationException, IllegalAccessException   {
        return (Site) clazz.newInstance();
    }
}
