using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public interface IMyObservable
    {
        void notifyAllOvservers();
        void notifyAllOvservers(Object arg);
        void attachAObserver(MyObserver observer);
        void detachAObserver(MyObserver observer);
        int countObservers();
        void setChange();
        void clearChange();
        void hasChange();
    }
}
