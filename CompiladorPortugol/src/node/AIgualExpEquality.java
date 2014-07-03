/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIgualExpEquality extends PExpEquality
{
    private PExpEquality _expEquality_;
    private TIgual _igual_;
    private PExpRelational _expRelational_;

    public AIgualExpEquality()
    {
        // Constructor
    }

    public AIgualExpEquality(
        @SuppressWarnings("hiding") PExpEquality _expEquality_,
        @SuppressWarnings("hiding") TIgual _igual_,
        @SuppressWarnings("hiding") PExpRelational _expRelational_)
    {
        // Constructor
        setExpEquality(_expEquality_);

        setIgual(_igual_);

        setExpRelational(_expRelational_);

    }

    @Override
    public Object clone()
    {
        return new AIgualExpEquality(
            cloneNode(this._expEquality_),
            cloneNode(this._igual_),
            cloneNode(this._expRelational_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualExpEquality(this);
    }

    public PExpEquality getExpEquality()
    {
        return this._expEquality_;
    }

    public void setExpEquality(PExpEquality node)
    {
        if(this._expEquality_ != null)
        {
            this._expEquality_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expEquality_ = node;
    }

    public TIgual getIgual()
    {
        return this._igual_;
    }

    public void setIgual(TIgual node)
    {
        if(this._igual_ != null)
        {
            this._igual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igual_ = node;
    }

    public PExpRelational getExpRelational()
    {
        return this._expRelational_;
    }

    public void setExpRelational(PExpRelational node)
    {
        if(this._expRelational_ != null)
        {
            this._expRelational_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expRelational_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expEquality_)
            + toString(this._igual_)
            + toString(this._expRelational_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expEquality_ == child)
        {
            this._expEquality_ = null;
            return;
        }

        if(this._igual_ == child)
        {
            this._igual_ = null;
            return;
        }

        if(this._expRelational_ == child)
        {
            this._expRelational_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expEquality_ == oldChild)
        {
            setExpEquality((PExpEquality) newChild);
            return;
        }

        if(this._igual_ == oldChild)
        {
            setIgual((TIgual) newChild);
            return;
        }

        if(this._expRelational_ == oldChild)
        {
            setExpRelational((PExpRelational) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}