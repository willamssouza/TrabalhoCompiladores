/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotFactorlogic extends PFactorlogic
{
    private TNao _nao_;
    private PExprelational _exprelational_;

    public ANotFactorlogic()
    {
        // Constructor
    }

    public ANotFactorlogic(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PExprelational _exprelational_)
    {
        // Constructor
        setNao(_nao_);

        setExprelational(_exprelational_);

    }

    @Override
    public Object clone()
    {
        return new ANotFactorlogic(
            cloneNode(this._nao_),
            cloneNode(this._exprelational_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotFactorlogic(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
    }

    public PExprelational getExprelational()
    {
        return this._exprelational_;
    }

    public void setExprelational(PExprelational node)
    {
        if(this._exprelational_ != null)
        {
            this._exprelational_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprelational_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nao_)
            + toString(this._exprelational_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
            return;
        }

        if(this._exprelational_ == child)
        {
            this._exprelational_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
            return;
        }

        if(this._exprelational_ == oldChild)
        {
            setExprelational((PExprelational) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}