using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public abstract class MyObserver
    {
        public abstract void update();
        public abstract void update(Object args);
    }
}
