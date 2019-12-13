package com.beau.tree;

import com.beau.common.INode;

@FunctionalInterface
public interface ITreeVisit {

    void visit(INode node);
}
