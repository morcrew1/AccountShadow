public class FilterManager{
    public Result applyFilters(Request requestObject){
        //query Db to pull all filters
        //iterate through dbResultRows

        for (DBRow row: dbResultRows){
            String className = row.get(0); //className being PhoneFilter, EmailFilter, etc.

            //create abstract filter and apply it to class
            AbstractFilter filter = Class.forName(className); //doesn't this instantiate the class filter?
            int filterResult = filter.apply(requestObject);
        }
    }
}