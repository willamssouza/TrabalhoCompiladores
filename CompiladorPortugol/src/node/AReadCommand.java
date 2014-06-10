/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AReadCommand extends PCommand
{
    private TLeia _leia_;
    private TParE _parE_;
    private final LinkedList<PVarlist> _varlist_ = new LinkedList<PVarlist>();
    private PVar _var_;
    private TParD _parD_;
    private TSemicolon _semicolon_;

    public AReadCommand()
    {
        // Constructor
    }

    public AReadCommand(
        @SuppressWarnings("hiding") TLeia _leia_,
        @SuppressWarnings("hiding") TParE _parE_,
        @SuppressWarnings("hiding") List<?> _varlist_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TParD _parD_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setLeia(_leia_);

        setParE(_parE_);

        setVarlist(_varlist_);

        setVar(_var_);

        setParD(_parD_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AReadCommand(
            cloneNode(this._leia_),
            cloneNode(this._parE_),
            cloneList(this._varlist_),
            cloneNode(this._var_),
            cloneNode(this._parD_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReadCommand(this);
    }

    public TLeia getLeia()
    {
        return this._leia_;
    }

    public void setLeia(TLeia node)
    {
        if(this._leia_ != null)
        {
            this._leia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leia_ = node;
    }

    public TParE getParE()
    {
        return this._parE_;
    }

    public void setParE(TParE node)
    {
        if(this._parE_ != null)
        {
            this._parE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parE_ = node;
    }

    public LinkedList<PVarlist> getVarlist()
    {
        return this._varlist_;
    }

    public void setVarlist(List<?> list)
    {
        for(PVarlist e : this._varlist_)
        {
            e.parent(null);
        }
        this._varlist_.clear();

        for(Object obj_e : list)
        {
            PVarlist e = (PVarlist) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._varlist_.add(e);
        }
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TParD getParD()
    {
        return this._parD_;
    }

    public void setParD(TParD node)
    {
        if(this._parD_ != null)
        {
            this._parD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parD_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leia_)
            + toString(this._parE_)
            + toString(this._varlist_)
            + toString(this._var_)
            + toString(this._parD_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leia_ == child)
        {
            this._leia_ = null;
            return;
        }

        if(this._parE_ == child)
        {
            this._parE_ = null;
            return;
        }

        if(this._varlist_.remove(child))
        {
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._parD_ == child)
        {
            this._parD_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leia_ == oldChild)
        {
            setLeia((TLeia) newChild);
            return;
        }

        if(this._parE_ == oldChild)
        {
            setParE((TParE) newChild);
            return;
        }

        for(ListIterator<PVarlist> i = this._varlist_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVarlist) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._parD_ == oldChild)
        {
            setParD((TParD) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}