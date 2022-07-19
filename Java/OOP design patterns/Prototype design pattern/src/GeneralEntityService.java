public class GeneralEntityService {
    public DocType findDocTypebyId(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DocType doctype = new DocType();
        doctype.setId(id);

        String name;
        if (id.compareTo(1L)== 0) {
            name = "Personal";
        }
        else if(id.compareTo(2L)== 0) {

            name = "Business";
        }
        else  {
            name = "general";
        }

        doctype.setName(name);

        return doctype;
    }

    public Category findCategorybyId(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L)== 0) {
            name = "Private";
        }
        else if(id.compareTo(2L)== 0) {

            name = "Business";
        }
        else  {
            name = "general";
        }

        category.setName(name);

        return category;
    }
    public Doc findDocById(Long id)
    {
        try {
            Thread.sleep(2000);

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        Doc document = new Doc();
        document.setId(id);
        document.setDocType(findDocTypebyId(id));
        document.setCategory(findCategorybyId(id));

        String name;
        String data;
        if(id.compareTo(1L) == 0)
        {
            name = "sayHello";
            data = " printf('Hello World')";
        }
        else if(id.compareTo(2L)== 0)
        {
            name = "sayGoodbye";
            data = " printf('See you later')";
        }
        else {
            name = "sayNothing";
            data = " printf('...)";
        }
        document.setName(name);
        document.setData(data);

        return document;
    }

}
