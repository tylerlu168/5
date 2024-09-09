abstract class Item
{
    private String title;

    public abstract String getListing();

    public Item()
    {
        title = "";
    }

    public Item(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String inputTitle)
    {
        title=inputTitle;
    }

    @Override
    public String toString()
    {
        return title;
    }


}
