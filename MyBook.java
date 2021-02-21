public class MyBook{

}
class Book {
    private String isbn;
    private int publicationYear;
    private int pages;
    
    public Book()
    {

    }

    public Book(String isbn, int pages)
    {
        this.isbn = isbn;
        this.pages = pages;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public String getIsbn()
    {
        return this.isbn;
    }
    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear()
    {
        return this.publicationYear;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public int getPages()
    {
        return this.pages;
    }

}
class Hardcover extends Book{

    public Hardcover()
    {
        super();
    }

    public String binding()
    {
        return "Method binding called from Hardcover";
    }

}
class Paperback extends Book{
    public Paperback()
    {
        super();
    }
    public String coverArt()
    {
        return "Method coverArt called from Paperback";
    }


}
class Classic extends Hardcover{
    private int origPubYear;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    public Classic()
    {
        super();
    }
  
    public void setOrigPubYear(int origPubYear)
    {
        this.origPubYear= origPubYear;
    }
    public int getOrigPubYear()
    {
        return this.origPubYear;
    }
    public void setTheAuthor(Author theAuthor)
    {
        this.theAuthor = theAuthor;
    }
    public Author getTheAuthor()
    {
        return this.theAuthor;
    }
    public void setBookPublisher(Publisher[] bookPublisher)
    {
        this.bookPublisher = bookPublisher;
    } 
    public Publisher[] getBookPublisher()
    {
        return this.bookPublisher;
    }
    public String createNotes()
    {
        return "Method createNotes called from Classic";
    }

}
class Nonfiction extends Paperback{
    private Category deweyClassification;
    public Nonfiction()
    {
        super();
    }
    public void setDeweyClassification(Category deweyClassification)
    {
        this.deweyClassification = deweyClassification;
    }
    public Category getDeweyClassification()
    {
        return this.deweyClassification;
    }


}
class Fiction extends Paperback{
    public Fiction()
    {
        super();
    }
    public String coverArt()
    {
        return "Method coverArt called from Fiction";
    }
    public String genre()
    {
        return "Method genre called from Fiction";
    }

}

class Anthology extends Fiction{
    private Story[] story;
    public Anthology()
    {
        super();
    }
    public setStory(Story[] story)
    {
        this.story = story;
    }
    public Story[] getStory()
    {
        return this.getStory();
    }
    public String plot()
    {
        return "Method plot called from Anthology";
    }


}
class Novel extends Fiction{
    private Author theAuthor;
    private Series mySeries;
    public Novel()
    {
        super();
    }
    public setTheAuthor(Author theAuthor)
    {
        this.theAuthor = theAuthor;
    }
    public Author getTheAuthor()
    {
        return this.theAuthor;
    }
    public String theme()
    {
        return "Method theme called from Novel";
    }

}
class Story{
    private Author theAuthor;
    public Story()
    {

    }
    public void setTheAuthor(Author theAuthor)
    {
        this.theAuthor = theAuthor;
    }
    public Author getTheAuthor()
    {
        return this.theAuthor;
    }
    public String plot()
    {
        return "Method plot called from Story";
    }

}
class Publisher{
    private String name;
    private String address;
    private Classic[] classicsCatalog;
    public Publisher(String name, String address)
    {
        this.name = name;
        this.address = address;

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void getAddress()
    {
        return this.address;
    }
    public void setClassicsCatalog(Classic[] classicsCatalog)
    {
        this.classicsCatalog = classicsCatalog;
    }
    public Classic[] getClassicsCatalog()
    {
        return this.classicsCatalog;
    }
    public String printLetterHead()
    {
        return "Method printLetterHead called from Publisher";
    }
}
class Author{
    private String name;
    private String address;
    private int age;
    public Author(String name, String address, int age)
    {
        this.name = name;
        this.address = adress;
        this.age = age;
    }
    public Author()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public String write()
    {
        return "Method write called from Author";
    }

}
class Series{
    private String seriesName;
    public Series()
    {

    }
    public void setSeriesName(String seriesName)
    {
        this.seriesName = seriesName;
    }
    public string getSeriesName()
    {
        return this.seriesName;
    }
    public String theme()
    {
        return "Method theme called from Series";
    }

}
class Contract{
    private String date;
    private Publisher publisherInfo;
    private Author authorInfo;
    public Contract(String date, Publisher publisherInfo, Author authorInfo)
    {
        this.date = date;
        this.publisherInfo = publisherInfo;
        this.authorInfo = authorInfo;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public String getDate()
    {
        return this.date;
    }
    public void setPublisherInfo(Publisher publisherInfo)
    {
         this.publisherInfo = publisherInfo;
    }
    public Publisher getPublisherInfo()
    {
        return this.publisherInfo;
    }
    public void setAuthorInfo(Author authorInfo)
    {
        this.authorInfo = authorInfo;
    }
    public Author getAuthorInfo()
    {
        return this.authorInfo;
    }
    public String printContract()
    {
        return "Method printContract called from Contract";
    }

}
class Category{
    private Category subCategory;
    private Category superCategory;
    private String category;
    public Category()
    {

    }
    public void setSubCategory(Category subCategory)
    {
        this.subCategory = subCategory;
    }
    public Category getSubCategory()
    {
        return this.subCategory;
    }
    public void setSuperCategory(Category superCategory)
    {
        this.superCategory = superCategory;
    }
    public Category getSuperCategory()
    {
        return this.superCategory;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getCategory()
    {
        return this.category;
    }
    public String sort()
    {
        return "Method sort called from Category";
    }

}