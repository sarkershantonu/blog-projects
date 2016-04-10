using System;
using System.Collections.i;
using System.Linq;
using System.Text;

namespace IteratorPattern
{
    public interface IBookIterator
    {
        Iterator createIterator();
    }
}
