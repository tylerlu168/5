public class Periodical extends Item
{
    private int issueNum;

    public Periodical()
    {
        issueNum = 0;
    }

    public Periodical(String title, int issueNum)
    {
        super(title);
        this.issueNum = issueNum;
    }
    @Override
    public String getListing() {
        String output  = "Periodical Title - " + getTitle() + "\n" +
                            "Issue # - " + issueNum;

        return output;

    }

    public int getIssueNum()
    {
        return issueNum;
    }

    public void setIssueNum(int num)
    {
        issueNum = num;
    }



}
