/*
 * Copyright (c) 2016, Oracle and/or its affiliates.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided
 * with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.truffle.llvm.nodes.op.logical.integer;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.llvm.nodes.api.LLVMExpressionNode;

@NodeChildren({@NodeChild("leftNode"), @NodeChild("rightNode")})
public abstract class LLVMI8LogicalNode extends LLVMExpressionNode {

    public abstract static class LLVMI8AndNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte and(byte left, byte right) {
            return (byte) (left & right);
        }
    }

    public abstract static class LLVMI8OrNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte or(byte left, byte right) {
            return (byte) (left | right);
        }
    }

    public abstract static class LLVMI8XorNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte or(byte left, byte right) {
            return (byte) (left ^ right);
        }
    }

    public abstract static class LLVMI8ShlNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte shl(byte left, byte right) {
            return (byte) (left << right);
        }
    }

    public abstract static class LLVMI8LshrNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte ashr(byte left, byte right) {
            return (byte) (left >>> right);
        }
    }

    public abstract static class LLVMI8AshrNode extends LLVMI8LogicalNode {
        @Specialization
        protected byte ashr(byte left, byte right) {
            return (byte) (left >> right);
        }
    }

}