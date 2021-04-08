package com.example.diginotes.databinding;
import com.example.diginotes.R;
import com.example.diginotes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainHomePageBindingImpl extends FragmentMainHomePageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.logout, 1);
        sViewsWithIds.put(R.id.add, 2);
        sViewsWithIds.put(R.id.Grid, 3);
        sViewsWithIds.put(R.id.Folder1, 4);
        sViewsWithIds.put(R.id.Folder2, 5);
        sViewsWithIds.put(R.id.Folder3, 6);
        sViewsWithIds.put(R.id.Folder4, 7);
        sViewsWithIds.put(R.id.Folder5, 8);
        sViewsWithIds.put(R.id.Folder6, 9);
        sViewsWithIds.put(R.id.Folder7, 10);
        sViewsWithIds.put(R.id.Folder8, 11);
        sViewsWithIds.put(R.id.Folder9, 12);
        sViewsWithIds.put(R.id.Folder10, 13);
        sViewsWithIds.put(R.id.Folder11, 14);
        sViewsWithIds.put(R.id.Folder12, 15);
        sViewsWithIds.put(R.id.Folder13, 16);
        sViewsWithIds.put(R.id.Folder14, 17);
        sViewsWithIds.put(R.id.Folder15, 18);
        sViewsWithIds.put(R.id.Folder16, 19);
        sViewsWithIds.put(R.id.Folder17, 20);
        sViewsWithIds.put(R.id.Folder18, 21);
        sViewsWithIds.put(R.id.button, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainHomePageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentMainHomePageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.ImageButton) bindings[15]
            , (android.widget.ImageButton) bindings[16]
            , (android.widget.ImageButton) bindings[17]
            , (android.widget.ImageButton) bindings[18]
            , (android.widget.ImageButton) bindings[19]
            , (android.widget.ImageButton) bindings[20]
            , (android.widget.ImageButton) bindings[21]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.GridLayout) bindings[3]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.Button) bindings[22]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}