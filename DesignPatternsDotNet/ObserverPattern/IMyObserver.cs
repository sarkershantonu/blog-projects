using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public interface IMyObserver
    {
        void update();
        void update(Object args);
    }
}
