/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIgualConditionalXor extends PConditionalXor
{
    private PExpEquality _expEquality_;

    public AIgualConditionalXor()
    {
        // Constructor
    }

    public AIgualConditionalXor(
        @SuppressWarnings("hiding") PExpEquality _expEquality_)
    {
        // Constructor
        setExpEquality(_expEquality_);

    }

    @Override
    public Object clone()
    {
        return new AIgualConditionalXor(
            cloneNode(this._expEquality_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualConditionalXor(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._expEquality_);
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

        throw new RuntimeException("Not a child.");
    }
}