using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Composite
{
    class Program
    {
        static void Main(string[] args)
        {
            BookComponent tinGoyendaSeries = new BookType("TinGoyenda", "Written by Rokib Hasan");
            BookComponent masudRana = new BookType("MasudRana", "Written by Kazi Anawar Hossain");
            BookComponent robindroNath = new BookType("RobindroNath", "Written by Robindro Nath Tagor");
            BookComponent allBooks = new BookType("Book List", "All available books");
            allBooks.Add(robindroNath);
            robindroNath.Add(new Book("Gitanjoli", "Robindro Nath Tagor", 1905));
            robindroNath.Add(new Book("GolpoGuccho", "Robindro Nath Tagor", 1908));
            allBooks.Add(masudRana);
            masudRana.Add(new Book("Varot Nattoyom", "Kazi Anawar Hossain", 1967));
            masudRana.Add(new Book("Agni Purush", "Kazi Anawar Hossain", 1969));
            allBooks.Add(tinGoyendaSeries);
            tinGoyendaSeries.Add(new Book("Jhamela", "Rokib Hasan", 1994));
            tinGoyendaSeries.Add(new Book("TusarMeru", "Rokib Hasan", 1993));
            BookShelf myShelf = new BookShelf(allBooks);
            myShelf.GetBookList();
            Console.ReadLine();
        }
    }
}
