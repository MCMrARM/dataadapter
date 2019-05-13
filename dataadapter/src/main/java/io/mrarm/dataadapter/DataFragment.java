package io.mrarm.dataadapter;

public interface DataFragment<T> {

    int getItemCount();


    T getItem(int index);

    ViewHolderType<T> getHolderTypeFor(int index);


    void addListener(Listener listener);

    void removeListener(Listener listener);

    interface Listener {
        void onItemRangeInserted(DataFragment fragment, int index, int count);
        void onItemRangeRemoved(DataFragment fragment, int index, int count);
        void onItemRangeChanged(DataFragment fragment, int index, int count);
        void onItemRangeMoved(DataFragment fragment, int index, int toIndex, int count);
    }

}