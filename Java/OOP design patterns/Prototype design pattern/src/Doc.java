public class Doc implements Cloneable {

    private long id;
    private String name;
    private DocType docType;
    private Category category;
    private String data;

    public Doc(long id, String name, DocType docType, Category category, String data) {
        this.id = id;
        this.name = name;
        this.docType = docType;
        this.category = category;
        this.data = data;
    }
    public Doc()
    {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected Doc clone() throws CloneNotSupportedException {
        return (Doc) super.clone();
    }
}
