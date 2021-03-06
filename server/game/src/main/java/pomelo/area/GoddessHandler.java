package pomelo.area;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pomelo.Common;


public final class GoddessHandler {
    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public static final class EnterGoddessSceneRequest
            extends GeneratedMessage
            implements EnterGoddessSceneRequestOrBuilder {
        private static final EnterGoddessSceneRequest defaultInstance = new EnterGoddessSceneRequest(true);
        private final UnknownFieldSet unknownFields;

        private EnterGoddessSceneRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EnterGoddessSceneRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnterGoddessSceneRequest getDefaultInstance() {
            return defaultInstance;
        }

        public EnterGoddessSceneRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EnterGoddessSceneRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterGoddessSceneRequest.class, Builder.class);
        }

        public static Parser<EnterGoddessSceneRequest> PARSER = (Parser<EnterGoddessSceneRequest>) new AbstractParser<EnterGoddessSceneRequest>() {
            public GoddessHandler.EnterGoddessSceneRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.EnterGoddessSceneRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EnterGoddessSceneRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EnterGoddessSceneRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(data);
        }

        public static EnterGoddessSceneRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EnterGoddessSceneRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(data);
        }

        public static EnterGoddessSceneRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EnterGoddessSceneRequest parseFrom(InputStream input) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(input);
        }

        public static EnterGoddessSceneRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EnterGoddessSceneRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseDelimitedFrom(input);
        }

        public static EnterGoddessSceneRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EnterGoddessSceneRequest parseFrom(CodedInputStream input) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(input);
        }

        public static EnterGoddessSceneRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnterGoddessSceneRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.EnterGoddessSceneRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.EnterGoddessSceneRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.EnterGoddessSceneRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneRequest_descriptor;
            }

            public GoddessHandler.EnterGoddessSceneRequest getDefaultInstanceForType() {
                return GoddessHandler.EnterGoddessSceneRequest.getDefaultInstance();
            }

            public GoddessHandler.EnterGoddessSceneRequest build() {
                GoddessHandler.EnterGoddessSceneRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.EnterGoddessSceneRequest buildPartial() {
                GoddessHandler.EnterGoddessSceneRequest result = new GoddessHandler.EnterGoddessSceneRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.EnterGoddessSceneRequest)
                    return mergeFrom((GoddessHandler.EnterGoddessSceneRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.EnterGoddessSceneRequest other) {
                if (other == GoddessHandler.EnterGoddessSceneRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.EnterGoddessSceneRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.EnterGoddessSceneRequest) GoddessHandler.EnterGoddessSceneRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.EnterGoddessSceneRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OutGoddessSceneRequest
            extends GeneratedMessage
            implements OutGoddessSceneRequestOrBuilder {
        private static final OutGoddessSceneRequest defaultInstance = new OutGoddessSceneRequest(true);
        private final UnknownFieldSet unknownFields;

        private OutGoddessSceneRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OutGoddessSceneRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OutGoddessSceneRequest getDefaultInstance() {
            return defaultInstance;
        }

        public OutGoddessSceneRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OutGoddessSceneRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OutGoddessSceneRequest.class, Builder.class);
        }

        public static Parser<OutGoddessSceneRequest> PARSER = (Parser<OutGoddessSceneRequest>) new AbstractParser<OutGoddessSceneRequest>() {
            public GoddessHandler.OutGoddessSceneRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OutGoddessSceneRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OutGoddessSceneRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OutGoddessSceneRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(data);
        }

        public static OutGoddessSceneRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OutGoddessSceneRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(data);
        }

        public static OutGoddessSceneRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OutGoddessSceneRequest parseFrom(InputStream input) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(input);
        }

        public static OutGoddessSceneRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OutGoddessSceneRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseDelimitedFrom(input);
        }

        public static OutGoddessSceneRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OutGoddessSceneRequest parseFrom(CodedInputStream input) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(input);
        }

        public static OutGoddessSceneRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OutGoddessSceneRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OutGoddessSceneRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OutGoddessSceneRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OutGoddessSceneRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneRequest_descriptor;
            }

            public GoddessHandler.OutGoddessSceneRequest getDefaultInstanceForType() {
                return GoddessHandler.OutGoddessSceneRequest.getDefaultInstance();
            }

            public GoddessHandler.OutGoddessSceneRequest build() {
                GoddessHandler.OutGoddessSceneRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OutGoddessSceneRequest buildPartial() {
                GoddessHandler.OutGoddessSceneRequest result = new GoddessHandler.OutGoddessSceneRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OutGoddessSceneRequest)
                    return mergeFrom((GoddessHandler.OutGoddessSceneRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OutGoddessSceneRequest other) {
                if (other == GoddessHandler.OutGoddessSceneRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OutGoddessSceneRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OutGoddessSceneRequest) GoddessHandler.OutGoddessSceneRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OutGoddessSceneRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ActiveGoddessRequest
            extends GeneratedMessage
            implements ActiveGoddessRequestOrBuilder {
        private static final ActiveGoddessRequest defaultInstance = new ActiveGoddessRequest(true);
        private final UnknownFieldSet unknownFields;

        private ActiveGoddessRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ActiveGoddessRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ActiveGoddessRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ActiveGoddessRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ActiveGoddessRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessTemplateId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_ActiveGoddessRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_ActiveGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ActiveGoddessRequest.class, Builder.class);
        }

        public static Parser<ActiveGoddessRequest> PARSER = (Parser<ActiveGoddessRequest>) new AbstractParser<ActiveGoddessRequest>() {
            public GoddessHandler.ActiveGoddessRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.ActiveGoddessRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSTEMPLATEID_FIELD_NUMBER = 1;
        private int c2SGoddessTemplateId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ActiveGoddessRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessTemplateId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessTemplateId() {
            return this.c2SGoddessTemplateId_;
        }

        private void initFields() {
            this.c2SGoddessTemplateId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessTemplateId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessTemplateId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessTemplateId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ActiveGoddessRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ActiveGoddessRequest) PARSER.parseFrom(data);
        }

        public static ActiveGoddessRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ActiveGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ActiveGoddessRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ActiveGoddessRequest) PARSER.parseFrom(data);
        }

        public static ActiveGoddessRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ActiveGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ActiveGoddessRequest parseFrom(InputStream input) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseFrom(input);
        }

        public static ActiveGoddessRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ActiveGoddessRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ActiveGoddessRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ActiveGoddessRequest parseFrom(CodedInputStream input) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseFrom(input);
        }

        public static ActiveGoddessRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ActiveGoddessRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.ActiveGoddessRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessTemplateId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.ActiveGoddessRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.ActiveGoddessRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessTemplateId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessRequest_descriptor;
            }

            public GoddessHandler.ActiveGoddessRequest getDefaultInstanceForType() {
                return GoddessHandler.ActiveGoddessRequest.getDefaultInstance();
            }

            public GoddessHandler.ActiveGoddessRequest build() {
                GoddessHandler.ActiveGoddessRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.ActiveGoddessRequest buildPartial() {
                GoddessHandler.ActiveGoddessRequest result = new GoddessHandler.ActiveGoddessRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessTemplateId_ = this.c2SGoddessTemplateId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.ActiveGoddessRequest)
                    return mergeFrom((GoddessHandler.ActiveGoddessRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.ActiveGoddessRequest other) {
                if (other == GoddessHandler.ActiveGoddessRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessTemplateId()) setC2SGoddessTemplateId(other.getC2SGoddessTemplateId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessTemplateId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.ActiveGoddessRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.ActiveGoddessRequest) GoddessHandler.ActiveGoddessRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.ActiveGoddessRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessTemplateId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessTemplateId() {
                return this.c2SGoddessTemplateId_;
            }

            public Builder setC2SGoddessTemplateId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessTemplateId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessTemplateId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessTemplateId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OnBattleGoddessRequest
            extends GeneratedMessage
            implements OnBattleGoddessRequestOrBuilder {
        private static final OnBattleGoddessRequest defaultInstance = new OnBattleGoddessRequest(true);
        private final UnknownFieldSet unknownFields;

        private OnBattleGoddessRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OnBattleGoddessRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OnBattleGoddessRequest getDefaultInstance() {
            return defaultInstance;
        }

        public OnBattleGoddessRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OnBattleGoddessRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OnBattleGoddessRequest.class, Builder.class);
        }

        public static Parser<OnBattleGoddessRequest> PARSER = (Parser<OnBattleGoddessRequest>) new AbstractParser<OnBattleGoddessRequest>() {
            public GoddessHandler.OnBattleGoddessRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OnBattleGoddessRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OnBattleGoddessRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OnBattleGoddessRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(data);
        }

        public static OnBattleGoddessRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnBattleGoddessRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(data);
        }

        public static OnBattleGoddessRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnBattleGoddessRequest parseFrom(InputStream input) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(input);
        }

        public static OnBattleGoddessRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OnBattleGoddessRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseDelimitedFrom(input);
        }

        public static OnBattleGoddessRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OnBattleGoddessRequest parseFrom(CodedInputStream input) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(input);
        }

        public static OnBattleGoddessRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OnBattleGoddessRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OnBattleGoddessRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OnBattleGoddessRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OnBattleGoddessRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessRequest_descriptor;
            }

            public GoddessHandler.OnBattleGoddessRequest getDefaultInstanceForType() {
                return GoddessHandler.OnBattleGoddessRequest.getDefaultInstance();
            }

            public GoddessHandler.OnBattleGoddessRequest build() {
                GoddessHandler.OnBattleGoddessRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OnBattleGoddessRequest buildPartial() {
                GoddessHandler.OnBattleGoddessRequest result = new GoddessHandler.OnBattleGoddessRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OnBattleGoddessRequest)
                    return mergeFrom((GoddessHandler.OnBattleGoddessRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OnBattleGoddessRequest other) {
                if (other == GoddessHandler.OnBattleGoddessRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OnBattleGoddessRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OnBattleGoddessRequest) GoddessHandler.OnBattleGoddessRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OnBattleGoddessRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OffBattleGoddessRequest
            extends GeneratedMessage
            implements OffBattleGoddessRequestOrBuilder {
        private static final OffBattleGoddessRequest defaultInstance = new OffBattleGoddessRequest(true);
        private final UnknownFieldSet unknownFields;

        private OffBattleGoddessRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OffBattleGoddessRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OffBattleGoddessRequest getDefaultInstance() {
            return defaultInstance;
        }

        public OffBattleGoddessRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OffBattleGoddessRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OffBattleGoddessRequest.class, Builder.class);
        }

        public static Parser<OffBattleGoddessRequest> PARSER = (Parser<OffBattleGoddessRequest>) new AbstractParser<OffBattleGoddessRequest>() {
            public GoddessHandler.OffBattleGoddessRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OffBattleGoddessRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OffBattleGoddessRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OffBattleGoddessRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(data);
        }

        public static OffBattleGoddessRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OffBattleGoddessRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(data);
        }

        public static OffBattleGoddessRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OffBattleGoddessRequest parseFrom(InputStream input) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(input);
        }

        public static OffBattleGoddessRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OffBattleGoddessRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseDelimitedFrom(input);
        }

        public static OffBattleGoddessRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OffBattleGoddessRequest parseFrom(CodedInputStream input) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(input);
        }

        public static OffBattleGoddessRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OffBattleGoddessRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OffBattleGoddessRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OffBattleGoddessRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OffBattleGoddessRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessRequest_descriptor;
            }

            public GoddessHandler.OffBattleGoddessRequest getDefaultInstanceForType() {
                return GoddessHandler.OffBattleGoddessRequest.getDefaultInstance();
            }

            public GoddessHandler.OffBattleGoddessRequest build() {
                GoddessHandler.OffBattleGoddessRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OffBattleGoddessRequest buildPartial() {
                GoddessHandler.OffBattleGoddessRequest result = new GoddessHandler.OffBattleGoddessRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OffBattleGoddessRequest)
                    return mergeFrom((GoddessHandler.OffBattleGoddessRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OffBattleGoddessRequest other) {
                if (other == GoddessHandler.OffBattleGoddessRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OffBattleGoddessRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OffBattleGoddessRequest) GoddessHandler.OffBattleGoddessRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OffBattleGoddessRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGiftsRequest
            extends GeneratedMessage
            implements GetGiftsRequestOrBuilder {
        private static final GetGiftsRequest defaultInstance = new GetGiftsRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetGiftsRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGiftsRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGiftsRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetGiftsRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGiftsRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetGiftsRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetGiftsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGiftsRequest.class, Builder.class);
        }

        public static Parser<GetGiftsRequest> PARSER = (Parser<GetGiftsRequest>) new AbstractParser<GetGiftsRequest>() {
            public GoddessHandler.GetGiftsRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetGiftsRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGiftsRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGiftsRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGiftsRequest) PARSER.parseFrom(data);
        }

        public static GetGiftsRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGiftsRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGiftsRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGiftsRequest) PARSER.parseFrom(data);
        }

        public static GetGiftsRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGiftsRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGiftsRequest parseFrom(InputStream input) throws IOException {
            return (GetGiftsRequest) PARSER.parseFrom(input);
        }

        public static GetGiftsRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGiftsRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGiftsRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetGiftsRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGiftsRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetGiftsRequest) PARSER.parseFrom(input);
        }

        public static GetGiftsRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGiftsRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GetGiftsRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetGiftsRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetGiftsRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsRequest_descriptor;
            }

            public GoddessHandler.GetGiftsRequest getDefaultInstanceForType() {
                return GoddessHandler.GetGiftsRequest.getDefaultInstance();
            }

            public GoddessHandler.GetGiftsRequest build() {
                GoddessHandler.GetGiftsRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetGiftsRequest buildPartial() {
                GoddessHandler.GetGiftsRequest result = new GoddessHandler.GetGiftsRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetGiftsRequest)
                    return mergeFrom((GoddessHandler.GetGiftsRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetGiftsRequest other) {
                if (other == GoddessHandler.GetGiftsRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetGiftsRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetGiftsRequest) GoddessHandler.GetGiftsRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetGiftsRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class BuyGiftRequest
            extends GeneratedMessage
            implements BuyGiftRequestOrBuilder {
        private static final BuyGiftRequest defaultInstance = new BuyGiftRequest(true);
        private final UnknownFieldSet unknownFields;

        private BuyGiftRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private BuyGiftRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static BuyGiftRequest getDefaultInstance() {
            return defaultInstance;
        }

        public BuyGiftRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BuyGiftRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.c2SGiftId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_BuyGiftRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_BuyGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGiftRequest.class, Builder.class);
        }

        public static Parser<BuyGiftRequest> PARSER = (Parser<BuyGiftRequest>) new AbstractParser<BuyGiftRequest>() {
            public GoddessHandler.BuyGiftRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.BuyGiftRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        public static final int C2S_GIFTID_FIELD_NUMBER = 2;
        private int c2SGiftId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<BuyGiftRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        public boolean hasC2SGiftId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getC2SGiftId() {
            return this.c2SGiftId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
            this.c2SGiftId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasC2SGiftId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.c2SGiftId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.c2SGiftId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static BuyGiftRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BuyGiftRequest) PARSER.parseFrom(data);
        }

        public static BuyGiftRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BuyGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static BuyGiftRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BuyGiftRequest) PARSER.parseFrom(data);
        }

        public static BuyGiftRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BuyGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static BuyGiftRequest parseFrom(InputStream input) throws IOException {
            return (BuyGiftRequest) PARSER.parseFrom(input);
        }

        public static BuyGiftRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static BuyGiftRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (BuyGiftRequest) PARSER.parseDelimitedFrom(input);
        }

        public static BuyGiftRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static BuyGiftRequest parseFrom(CodedInputStream input) throws IOException {
            return (BuyGiftRequest) PARSER.parseFrom(input);
        }

        public static BuyGiftRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(BuyGiftRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.BuyGiftRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;
            private int c2SGiftId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.BuyGiftRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.BuyGiftRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGiftId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftRequest_descriptor;
            }

            public GoddessHandler.BuyGiftRequest getDefaultInstanceForType() {
                return GoddessHandler.BuyGiftRequest.getDefaultInstance();
            }

            public GoddessHandler.BuyGiftRequest build() {
                GoddessHandler.BuyGiftRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.BuyGiftRequest buildPartial() {
                GoddessHandler.BuyGiftRequest result = new GoddessHandler.BuyGiftRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.c2SGiftId_ = this.c2SGiftId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.BuyGiftRequest)
                    return mergeFrom((GoddessHandler.BuyGiftRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.BuyGiftRequest other) {
                if (other == GoddessHandler.BuyGiftRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                if (other.hasC2SGiftId()) setC2SGiftId(other.getC2SGiftId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                if (!hasC2SGiftId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.BuyGiftRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.BuyGiftRequest) GoddessHandler.BuyGiftRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.BuyGiftRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasC2SGiftId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getC2SGiftId() {
                return this.c2SGiftId_;
            }

            public Builder setC2SGiftId(int value) {
                this.bitField0_ |= 0x2;
                this.c2SGiftId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGiftId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.c2SGiftId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class UnEquipGiftRequest
            extends GeneratedMessage
            implements UnEquipGiftRequestOrBuilder {
        private static final UnEquipGiftRequest defaultInstance = new UnEquipGiftRequest(true);
        private final UnknownFieldSet unknownFields;

        private UnEquipGiftRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UnEquipGiftRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UnEquipGiftRequest getDefaultInstance() {
            return defaultInstance;
        }

        public UnEquipGiftRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UnEquipGiftRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.c2SGiftId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UnEquipGiftRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UnEquipGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UnEquipGiftRequest.class, Builder.class);
        }

        public static Parser<UnEquipGiftRequest> PARSER = (Parser<UnEquipGiftRequest>) new AbstractParser<UnEquipGiftRequest>() {
            public GoddessHandler.UnEquipGiftRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UnEquipGiftRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        public static final int C2S_GIFTID_FIELD_NUMBER = 2;
        private int c2SGiftId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UnEquipGiftRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        public boolean hasC2SGiftId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getC2SGiftId() {
            return this.c2SGiftId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
            this.c2SGiftId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasC2SGiftId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.c2SGiftId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.c2SGiftId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static UnEquipGiftRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UnEquipGiftRequest) PARSER.parseFrom(data);
        }

        public static UnEquipGiftRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UnEquipGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UnEquipGiftRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UnEquipGiftRequest) PARSER.parseFrom(data);
        }

        public static UnEquipGiftRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UnEquipGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UnEquipGiftRequest parseFrom(InputStream input) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseFrom(input);
        }

        public static UnEquipGiftRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static UnEquipGiftRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseDelimitedFrom(input);
        }

        public static UnEquipGiftRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UnEquipGiftRequest parseFrom(CodedInputStream input) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseFrom(input);
        }

        public static UnEquipGiftRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UnEquipGiftRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.UnEquipGiftRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;
            private int c2SGiftId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UnEquipGiftRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UnEquipGiftRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGiftId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftRequest_descriptor;
            }

            public GoddessHandler.UnEquipGiftRequest getDefaultInstanceForType() {
                return GoddessHandler.UnEquipGiftRequest.getDefaultInstance();
            }

            public GoddessHandler.UnEquipGiftRequest build() {
                GoddessHandler.UnEquipGiftRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.UnEquipGiftRequest buildPartial() {
                GoddessHandler.UnEquipGiftRequest result = new GoddessHandler.UnEquipGiftRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.c2SGiftId_ = this.c2SGiftId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UnEquipGiftRequest)
                    return mergeFrom((GoddessHandler.UnEquipGiftRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.UnEquipGiftRequest other) {
                if (other == GoddessHandler.UnEquipGiftRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                if (other.hasC2SGiftId()) setC2SGiftId(other.getC2SGiftId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                if (!hasC2SGiftId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UnEquipGiftRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UnEquipGiftRequest) GoddessHandler.UnEquipGiftRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UnEquipGiftRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasC2SGiftId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getC2SGiftId() {
                return this.c2SGiftId_;
            }

            public Builder setC2SGiftId(int value) {
                this.bitField0_ |= 0x2;
                this.c2SGiftId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGiftId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.c2SGiftId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipGiftRequest
            extends GeneratedMessage
            implements EquipGiftRequestOrBuilder {
        private static final EquipGiftRequest defaultInstance = new EquipGiftRequest(true);
        private final UnknownFieldSet unknownFields;

        private EquipGiftRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipGiftRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipGiftRequest getDefaultInstance() {
            return defaultInstance;
        }

        public EquipGiftRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipGiftRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.c2SGiftId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_EquipGiftRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_EquipGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipGiftRequest.class, Builder.class);
        }

        public static Parser<EquipGiftRequest> PARSER = (Parser<EquipGiftRequest>) new AbstractParser<EquipGiftRequest>() {
            public GoddessHandler.EquipGiftRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.EquipGiftRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        public static final int C2S_GIFTID_FIELD_NUMBER = 2;
        private int c2SGiftId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipGiftRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        public boolean hasC2SGiftId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getC2SGiftId() {
            return this.c2SGiftId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
            this.c2SGiftId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasC2SGiftId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.c2SGiftId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.c2SGiftId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipGiftRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipGiftRequest) PARSER.parseFrom(data);
        }

        public static EquipGiftRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGiftRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipGiftRequest) PARSER.parseFrom(data);
        }

        public static EquipGiftRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGiftRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGiftRequest parseFrom(InputStream input) throws IOException {
            return (EquipGiftRequest) PARSER.parseFrom(input);
        }

        public static EquipGiftRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipGiftRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipGiftRequest) PARSER.parseDelimitedFrom(input);
        }

        public static EquipGiftRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipGiftRequest parseFrom(CodedInputStream input) throws IOException {
            return (EquipGiftRequest) PARSER.parseFrom(input);
        }

        public static EquipGiftRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipGiftRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.EquipGiftRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;
            private int c2SGiftId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.EquipGiftRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.EquipGiftRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGiftId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftRequest_descriptor;
            }

            public GoddessHandler.EquipGiftRequest getDefaultInstanceForType() {
                return GoddessHandler.EquipGiftRequest.getDefaultInstance();
            }

            public GoddessHandler.EquipGiftRequest build() {
                GoddessHandler.EquipGiftRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.EquipGiftRequest buildPartial() {
                GoddessHandler.EquipGiftRequest result = new GoddessHandler.EquipGiftRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.c2SGiftId_ = this.c2SGiftId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.EquipGiftRequest)
                    return mergeFrom((GoddessHandler.EquipGiftRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.EquipGiftRequest other) {
                if (other == GoddessHandler.EquipGiftRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                if (other.hasC2SGiftId()) setC2SGiftId(other.getC2SGiftId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                if (!hasC2SGiftId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.EquipGiftRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.EquipGiftRequest) GoddessHandler.EquipGiftRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.EquipGiftRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasC2SGiftId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getC2SGiftId() {
                return this.c2SGiftId_;
            }

            public Builder setC2SGiftId(int value) {
                this.bitField0_ |= 0x2;
                this.c2SGiftId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGiftId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.c2SGiftId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class UpIntimacyRequest
            extends GeneratedMessage
            implements UpIntimacyRequestOrBuilder {
        private static final UpIntimacyRequest defaultInstance = new UpIntimacyRequest(true);
        private final UnknownFieldSet unknownFields;

        private UpIntimacyRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UpIntimacyRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UpIntimacyRequest getDefaultInstance() {
            return defaultInstance;
        }

        public UpIntimacyRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UpIntimacyRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.c2SType_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UpIntimacyRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UpIntimacyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpIntimacyRequest.class, Builder.class);
        }

        public static Parser<UpIntimacyRequest> PARSER = (Parser<UpIntimacyRequest>) new AbstractParser<UpIntimacyRequest>() {
            public GoddessHandler.UpIntimacyRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UpIntimacyRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        public static final int C2S_TYPE_FIELD_NUMBER = 2;
        private int c2SType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UpIntimacyRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        public boolean hasC2SType() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getC2SType() {
            return this.c2SType_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
            this.c2SType_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasC2SType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.c2SType_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.c2SType_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static UpIntimacyRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UpIntimacyRequest) PARSER.parseFrom(data);
        }

        public static UpIntimacyRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpIntimacyRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UpIntimacyRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UpIntimacyRequest) PARSER.parseFrom(data);
        }

        public static UpIntimacyRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpIntimacyRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UpIntimacyRequest parseFrom(InputStream input) throws IOException {
            return (UpIntimacyRequest) PARSER.parseFrom(input);
        }

        public static UpIntimacyRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static UpIntimacyRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (UpIntimacyRequest) PARSER.parseDelimitedFrom(input);
        }

        public static UpIntimacyRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UpIntimacyRequest parseFrom(CodedInputStream input) throws IOException {
            return (UpIntimacyRequest) PARSER.parseFrom(input);
        }

        public static UpIntimacyRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UpIntimacyRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.UpIntimacyRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;
            private int c2SType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UpIntimacyRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UpIntimacyRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SType_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyRequest_descriptor;
            }

            public GoddessHandler.UpIntimacyRequest getDefaultInstanceForType() {
                return GoddessHandler.UpIntimacyRequest.getDefaultInstance();
            }

            public GoddessHandler.UpIntimacyRequest build() {
                GoddessHandler.UpIntimacyRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.UpIntimacyRequest buildPartial() {
                GoddessHandler.UpIntimacyRequest result = new GoddessHandler.UpIntimacyRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.c2SType_ = this.c2SType_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UpIntimacyRequest)
                    return mergeFrom((GoddessHandler.UpIntimacyRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.UpIntimacyRequest other) {
                if (other == GoddessHandler.UpIntimacyRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                if (other.hasC2SType()) setC2SType(other.getC2SType());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                if (!hasC2SType()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UpIntimacyRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UpIntimacyRequest) GoddessHandler.UpIntimacyRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UpIntimacyRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasC2SType() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getC2SType() {
                return this.c2SType_;
            }

            public Builder setC2SType(int value) {
                this.bitField0_ |= 0x2;
                this.c2SType_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SType() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.c2SType_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class UpStarRequest
            extends GeneratedMessage
            implements UpStarRequestOrBuilder {
        private static final UpStarRequest defaultInstance = new UpStarRequest(true);
        private final UnknownFieldSet unknownFields;

        private UpStarRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UpStarRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UpStarRequest getDefaultInstance() {
            return defaultInstance;
        }

        public UpStarRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UpStarRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UpStarRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UpStarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpStarRequest.class, Builder.class);
        }

        public static Parser<UpStarRequest> PARSER = (Parser<UpStarRequest>) new AbstractParser<UpStarRequest>() {
            public GoddessHandler.UpStarRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UpStarRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UpStarRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static UpStarRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UpStarRequest) PARSER.parseFrom(data);
        }

        public static UpStarRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpStarRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UpStarRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UpStarRequest) PARSER.parseFrom(data);
        }

        public static UpStarRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpStarRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UpStarRequest parseFrom(InputStream input) throws IOException {
            return (UpStarRequest) PARSER.parseFrom(input);
        }

        public static UpStarRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static UpStarRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (UpStarRequest) PARSER.parseDelimitedFrom(input);
        }

        public static UpStarRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UpStarRequest parseFrom(CodedInputStream input) throws IOException {
            return (UpStarRequest) PARSER.parseFrom(input);
        }

        public static UpStarRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UpStarRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.UpStarRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UpStarRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UpStarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UpStarRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UpStarRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UpStarRequest_descriptor;
            }

            public GoddessHandler.UpStarRequest getDefaultInstanceForType() {
                return GoddessHandler.UpStarRequest.getDefaultInstance();
            }

            public GoddessHandler.UpStarRequest build() {
                GoddessHandler.UpStarRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.UpStarRequest buildPartial() {
                GoddessHandler.UpStarRequest result = new GoddessHandler.UpStarRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UpStarRequest)
                    return mergeFrom((GoddessHandler.UpStarRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.UpStarRequest other) {
                if (other == GoddessHandler.UpStarRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UpStarRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UpStarRequest) GoddessHandler.UpStarRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UpStarRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetCommInfoRequest
            extends GeneratedMessage
            implements GetCommInfoRequestOrBuilder {
        private static final GetCommInfoRequest defaultInstance = new GetCommInfoRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetCommInfoRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetCommInfoRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetCommInfoRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetCommInfoRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetCommInfoRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetCommInfoRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetCommInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCommInfoRequest.class, Builder.class);
        }

        public static Parser<GetCommInfoRequest> PARSER = (Parser<GetCommInfoRequest>) new AbstractParser<GetCommInfoRequest>() {
            public GoddessHandler.GetCommInfoRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetCommInfoRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetCommInfoRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetCommInfoRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetCommInfoRequest) PARSER.parseFrom(data);
        }

        public static GetCommInfoRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetCommInfoRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetCommInfoRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetCommInfoRequest) PARSER.parseFrom(data);
        }

        public static GetCommInfoRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetCommInfoRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetCommInfoRequest parseFrom(InputStream input) throws IOException {
            return (GetCommInfoRequest) PARSER.parseFrom(input);
        }

        public static GetCommInfoRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetCommInfoRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetCommInfoRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetCommInfoRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetCommInfoRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetCommInfoRequest) PARSER.parseFrom(input);
        }

        public static GetCommInfoRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetCommInfoRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GetCommInfoRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetCommInfoRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetCommInfoRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoRequest_descriptor;
            }

            public GoddessHandler.GetCommInfoRequest getDefaultInstanceForType() {
                return GoddessHandler.GetCommInfoRequest.getDefaultInstance();
            }

            public GoddessHandler.GetCommInfoRequest build() {
                GoddessHandler.GetCommInfoRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetCommInfoRequest buildPartial() {
                GoddessHandler.GetCommInfoRequest result = new GoddessHandler.GetCommInfoRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetCommInfoRequest)
                    return mergeFrom((GoddessHandler.GetCommInfoRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetCommInfoRequest other) {
                if (other == GoddessHandler.GetCommInfoRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetCommInfoRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetCommInfoRequest) GoddessHandler.GetCommInfoRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetCommInfoRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGoddessDetailRequest
            extends GeneratedMessage
            implements GetGoddessDetailRequestOrBuilder {
        private static final GetGoddessDetailRequest defaultInstance = new GetGoddessDetailRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetGoddessDetailRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGoddessDetailRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGoddessDetailRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetGoddessDetailRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGoddessDetailRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.c2SGoddessId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGoddessDetailRequest.class, Builder.class);
        }

        public static Parser<GetGoddessDetailRequest> PARSER = (Parser<GetGoddessDetailRequest>) new AbstractParser<GetGoddessDetailRequest>() {
            public GoddessHandler.GetGoddessDetailRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetGoddessDetailRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int C2S_GODDESSID_FIELD_NUMBER = 1;
        private int c2SGoddessId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGoddessDetailRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasC2SGoddessId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getC2SGoddessId() {
            return this.c2SGoddessId_;
        }

        private void initFields() {
            this.c2SGoddessId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasC2SGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.c2SGoddessId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.c2SGoddessId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGoddessDetailRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(data);
        }

        public static GetGoddessDetailRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGoddessDetailRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(data);
        }

        public static GetGoddessDetailRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGoddessDetailRequest parseFrom(InputStream input) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(input);
        }

        public static GetGoddessDetailRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGoddessDetailRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetGoddessDetailRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGoddessDetailRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(input);
        }

        public static GetGoddessDetailRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGoddessDetailRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GetGoddessDetailRequestOrBuilder {
            private int bitField0_;
            private int c2SGoddessId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetGoddessDetailRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetGoddessDetailRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.c2SGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailRequest_descriptor;
            }

            public GoddessHandler.GetGoddessDetailRequest getDefaultInstanceForType() {
                return GoddessHandler.GetGoddessDetailRequest.getDefaultInstance();
            }

            public GoddessHandler.GetGoddessDetailRequest build() {
                GoddessHandler.GetGoddessDetailRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetGoddessDetailRequest buildPartial() {
                GoddessHandler.GetGoddessDetailRequest result = new GoddessHandler.GetGoddessDetailRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.c2SGoddessId_ = this.c2SGoddessId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetGoddessDetailRequest)
                    return mergeFrom((GoddessHandler.GetGoddessDetailRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetGoddessDetailRequest other) {
                if (other == GoddessHandler.GetGoddessDetailRequest.getDefaultInstance()) return this;
                if (other.hasC2SGoddessId()) setC2SGoddessId(other.getC2SGoddessId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasC2SGoddessId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetGoddessDetailRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetGoddessDetailRequest) GoddessHandler.GetGoddessDetailRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetGoddessDetailRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasC2SGoddessId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getC2SGoddessId() {
                return this.c2SGoddessId_;
            }

            public Builder setC2SGoddessId(int value) {
                this.bitField0_ |= 0x1;
                this.c2SGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearC2SGoddessId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.c2SGoddessId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetAllGoddessRequest
            extends GeneratedMessage
            implements GetAllGoddessRequestOrBuilder {
        private static final GetAllGoddessRequest defaultInstance = new GetAllGoddessRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetAllGoddessRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetAllGoddessRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetAllGoddessRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetAllGoddessRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetAllGoddessRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetAllGoddessRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetAllGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllGoddessRequest.class, Builder.class);
        }

        public static Parser<GetAllGoddessRequest> PARSER = (Parser<GetAllGoddessRequest>) new AbstractParser<GetAllGoddessRequest>() {
            public GoddessHandler.GetAllGoddessRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetAllGoddessRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetAllGoddessRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetAllGoddessRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetAllGoddessRequest) PARSER.parseFrom(data);
        }

        public static GetAllGoddessRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetAllGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetAllGoddessRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetAllGoddessRequest) PARSER.parseFrom(data);
        }

        public static GetAllGoddessRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetAllGoddessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetAllGoddessRequest parseFrom(InputStream input) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseFrom(input);
        }

        public static GetAllGoddessRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetAllGoddessRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetAllGoddessRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetAllGoddessRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseFrom(input);
        }

        public static GetAllGoddessRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetAllGoddessRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GetAllGoddessRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetAllGoddessRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetAllGoddessRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessRequest_descriptor;
            }

            public GoddessHandler.GetAllGoddessRequest getDefaultInstanceForType() {
                return GoddessHandler.GetAllGoddessRequest.getDefaultInstance();
            }

            public GoddessHandler.GetAllGoddessRequest build() {
                GoddessHandler.GetAllGoddessRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetAllGoddessRequest buildPartial() {
                GoddessHandler.GetAllGoddessRequest result = new GoddessHandler.GetAllGoddessRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetAllGoddessRequest)
                    return mergeFrom((GoddessHandler.GetAllGoddessRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetAllGoddessRequest other) {
                if (other == GoddessHandler.GetAllGoddessRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetAllGoddessRequest parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetAllGoddessRequest) GoddessHandler.GetAllGoddessRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetAllGoddessRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGiftsResponse
            extends GeneratedMessage
            implements GetGiftsResponseOrBuilder {
        private static final GetGiftsResponse defaultInstance = new GetGiftsResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetGiftsResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGiftsResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGiftsResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetGiftsResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGiftsResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.s2CGifts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.s2CGifts_.add(input.readMessage(GoddessHandler.GoddessGift.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.s2CGifts_ = Collections.unmodifiableList(this.s2CGifts_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetGiftsResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetGiftsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGiftsResponse.class, Builder.class);
        }

        public static Parser<GetGiftsResponse> PARSER = (Parser<GetGiftsResponse>) new AbstractParser<GetGiftsResponse>() {
            public GoddessHandler.GetGiftsResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetGiftsResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_GIFTS_FIELD_NUMBER = 3;
        private List<GoddessHandler.GoddessGift> s2CGifts_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGiftsResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        static {
            defaultInstance.initFields();
        }


        public List<GoddessHandler.GoddessGift> getS2CGiftsList() {
            return this.s2CGifts_;
        }

        public List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CGiftsOrBuilderList() {
            return (List) this.s2CGifts_;
        }

        public int getS2CGiftsCount() {
            return this.s2CGifts_.size();
        }

        public GoddessHandler.GoddessGift getS2CGifts(int index) {
            return this.s2CGifts_.get(index);
        }

        public GoddessHandler.GoddessGiftOrBuilder getS2CGiftsOrBuilder(int index) {
            return this.s2CGifts_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2CGifts_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getS2CGiftsCount(); i++) {
                if (!getS2CGifts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            for (int i = 0; i < this.s2CGifts_.size(); i++) {
                output.writeMessage(3, (MessageLite) this.s2CGifts_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            for (int i = 0; i < this.s2CGifts_.size(); i++) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2CGifts_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGiftsResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGiftsResponse) PARSER.parseFrom(data);
        }

        public static GetGiftsResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGiftsResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGiftsResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGiftsResponse) PARSER.parseFrom(data);
        }

        public static GetGiftsResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGiftsResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGiftsResponse parseFrom(InputStream input) throws IOException {
            return (GetGiftsResponse) PARSER.parseFrom(input);
        }

        public static GetGiftsResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGiftsResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGiftsResponse) PARSER.parseDelimitedFrom(input);
        }

        public static GetGiftsResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGiftsResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetGiftsResponse) PARSER.parseFrom(input);
        }

        public static GetGiftsResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGiftsResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGiftsResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GetGiftsResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<GoddessHandler.GoddessGift> s2CGifts_;
            private RepeatedFieldBuilder<GoddessHandler.GoddessGift, GoddessHandler.GoddessGift.Builder, GoddessHandler.GoddessGiftOrBuilder> s2CGiftsBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetGiftsResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.s2CGifts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CGifts_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetGiftsResponse.alwaysUseFieldBuilders) {
                    getS2CGiftsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2CGiftsBuilder_ == null) {
                    this.s2CGifts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.s2CGiftsBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetGiftsResponse_descriptor;
            }

            public GoddessHandler.GetGiftsResponse getDefaultInstanceForType() {
                return GoddessHandler.GetGiftsResponse.getDefaultInstance();
            }

            public GoddessHandler.GetGiftsResponse build() {
                GoddessHandler.GetGiftsResponse result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetGiftsResponse buildPartial() {
                GoddessHandler.GetGiftsResponse result = new GoddessHandler.GetGiftsResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.s2CGiftsBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.s2CGifts_ = Collections.unmodifiableList(this.s2CGifts_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.s2CGifts_ = this.s2CGifts_;
                } else {
                    result.s2CGifts_ = this.s2CGiftsBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetGiftsResponse)
                    return mergeFrom((GoddessHandler.GetGiftsResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetGiftsResponse other) {
                if (other == GoddessHandler.GetGiftsResponse.getDefaultInstance())
                    return this;
                if (other.hasS2CCode())
                    setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.s2CGiftsBuilder_ == null) {
                    if (!other.s2CGifts_.isEmpty()) {
                        if (this.s2CGifts_.isEmpty()) {
                            this.s2CGifts_ = other.s2CGifts_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureS2CGiftsIsMutable();
                            this.s2CGifts_.addAll(other.s2CGifts_);
                        }
                        onChanged();
                    }
                } else if (!other.s2CGifts_.isEmpty()) {
                    if (this.s2CGiftsBuilder_.isEmpty()) {
                        this.s2CGiftsBuilder_.dispose();
                        this.s2CGiftsBuilder_ = null;
                        this.s2CGifts_ = other.s2CGifts_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.s2CGiftsBuilder_ = GoddessHandler.GetGiftsResponse.alwaysUseFieldBuilders ? getS2CGiftsFieldBuilder() : null;
                    } else {
                        this.s2CGiftsBuilder_.addAllMessages(other.s2CGifts_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode())
                    return false;
                for (int i = 0; i < getS2CGiftsCount(); i++) {
                    if (!getS2CGifts(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetGiftsResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetGiftsResponse) GoddessHandler.GetGiftsResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetGiftsResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.GetGiftsResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            private void ensureS2CGiftsIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.s2CGifts_ = new ArrayList<>(this.s2CGifts_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<GoddessHandler.GoddessGift> getS2CGiftsList() {
                if (this.s2CGiftsBuilder_ == null)
                    return Collections.unmodifiableList(this.s2CGifts_);
                return this.s2CGiftsBuilder_.getMessageList();
            }

            public int getS2CGiftsCount() {
                if (this.s2CGiftsBuilder_ == null)
                    return this.s2CGifts_.size();
                return this.s2CGiftsBuilder_.getCount();
            }

            public GoddessHandler.GoddessGift getS2CGifts(int index) {
                if (this.s2CGiftsBuilder_ == null)
                    return this.s2CGifts_.get(index);
                return (GoddessHandler.GoddessGift) this.s2CGiftsBuilder_.getMessage(index);
            }

            public Builder setS2CGifts(int index, GoddessHandler.GoddessGift value) {
                if (this.s2CGiftsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.set(index, value);
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setS2CGifts(int index, GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CGiftsBuilder_ == null) {
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addS2CGifts(GoddessHandler.GoddessGift value) {
                if (this.s2CGiftsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.add(value);
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addS2CGifts(int index, GoddessHandler.GoddessGift value) {
                if (this.s2CGiftsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.add(index, value);
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addS2CGifts(GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CGiftsBuilder_ == null) {
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addS2CGifts(int index, GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CGiftsBuilder_ == null) {
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllS2CGifts(Iterable<? extends GoddessHandler.GoddessGift> values) {
                if (this.s2CGiftsBuilder_ == null) {
                    ensureS2CGiftsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.s2CGifts_);
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearS2CGifts() {
                if (this.s2CGiftsBuilder_ == null) {
                    this.s2CGifts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.clear();
                }
                return this;
            }

            public Builder removeS2CGifts(int index) {
                if (this.s2CGiftsBuilder_ == null) {
                    ensureS2CGiftsIsMutable();
                    this.s2CGifts_.remove(index);
                    onChanged();
                } else {
                    this.s2CGiftsBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessGift.Builder getS2CGiftsBuilder(int index) {
                return (GoddessHandler.GoddessGift.Builder) getS2CGiftsFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessGiftOrBuilder getS2CGiftsOrBuilder(int index) {
                if (this.s2CGiftsBuilder_ == null)
                    return this.s2CGifts_.get(index);
                return (GoddessHandler.GoddessGiftOrBuilder) this.s2CGiftsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CGiftsOrBuilderList() {
                if (this.s2CGiftsBuilder_ != null)
                    return this.s2CGiftsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.s2CGifts_);
            }

            public GoddessHandler.GoddessGift.Builder addS2CGiftsBuilder() {
                return (GoddessHandler.GoddessGift.Builder) getS2CGiftsFieldBuilder().addBuilder(GoddessHandler.GoddessGift.getDefaultInstance());
            }

            public GoddessHandler.GoddessGift.Builder addS2CGiftsBuilder(int index) {
                return (GoddessHandler.GoddessGift.Builder) getS2CGiftsFieldBuilder().addBuilder(index, GoddessHandler.GoddessGift.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessGift.Builder> getS2CGiftsBuilderList() {
                return getS2CGiftsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessGift, GoddessHandler.GoddessGift.Builder, GoddessHandler.GoddessGiftOrBuilder> getS2CGiftsFieldBuilder() {
                if (this.s2CGiftsBuilder_ == null) {
                    this.s2CGiftsBuilder_ = new RepeatedFieldBuilder(this.s2CGifts_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.s2CGifts_ = null;
                }
                return this.s2CGiftsBuilder_;
            }
        }
    }

    public static final class BuyGiftResponse
            extends GeneratedMessage
            implements BuyGiftResponseOrBuilder {
        private static final BuyGiftResponse defaultInstance = new BuyGiftResponse(true);
        private final UnknownFieldSet unknownFields;

        private BuyGiftResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private BuyGiftResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static BuyGiftResponse getDefaultInstance() {
            return defaultInstance;
        }

        public BuyGiftResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BuyGiftResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_BuyGiftResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_BuyGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGiftResponse.class, Builder.class);
        }

        public static Parser<BuyGiftResponse> PARSER = (Parser<BuyGiftResponse>) new AbstractParser<BuyGiftResponse>() {
            public GoddessHandler.BuyGiftResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.BuyGiftResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<BuyGiftResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static BuyGiftResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BuyGiftResponse) PARSER.parseFrom(data);
        }

        public static BuyGiftResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BuyGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static BuyGiftResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BuyGiftResponse) PARSER.parseFrom(data);
        }

        public static BuyGiftResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BuyGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static BuyGiftResponse parseFrom(InputStream input) throws IOException {
            return (BuyGiftResponse) PARSER.parseFrom(input);
        }

        public static BuyGiftResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static BuyGiftResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (BuyGiftResponse) PARSER.parseDelimitedFrom(input);
        }

        public static BuyGiftResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static BuyGiftResponse parseFrom(CodedInputStream input) throws IOException {
            return (BuyGiftResponse) PARSER.parseFrom(input);
        }

        public static BuyGiftResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BuyGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(BuyGiftResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.BuyGiftResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.BuyGiftResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.BuyGiftResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_BuyGiftResponse_descriptor;
            }

            public GoddessHandler.BuyGiftResponse getDefaultInstanceForType() {
                return GoddessHandler.BuyGiftResponse.getDefaultInstance();
            }

            public GoddessHandler.BuyGiftResponse build() {
                GoddessHandler.BuyGiftResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.BuyGiftResponse buildPartial() {
                GoddessHandler.BuyGiftResponse result = new GoddessHandler.BuyGiftResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.BuyGiftResponse)
                    return mergeFrom((GoddessHandler.BuyGiftResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.BuyGiftResponse other) {
                if (other == GoddessHandler.BuyGiftResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.BuyGiftResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.BuyGiftResponse) GoddessHandler.BuyGiftResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.BuyGiftResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.BuyGiftResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class UnEquipGiftResponse
            extends GeneratedMessage
            implements UnEquipGiftResponseOrBuilder {
        private static final UnEquipGiftResponse defaultInstance = new UnEquipGiftResponse(true);
        private final UnknownFieldSet unknownFields;

        private UnEquipGiftResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UnEquipGiftResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UnEquipGiftResponse getDefaultInstance() {
            return defaultInstance;
        }

        public UnEquipGiftResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UnEquipGiftResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UnEquipGiftResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UnEquipGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UnEquipGiftResponse.class, Builder.class);
        }

        public static Parser<UnEquipGiftResponse> PARSER = (Parser<UnEquipGiftResponse>) new AbstractParser<UnEquipGiftResponse>() {
            public GoddessHandler.UnEquipGiftResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UnEquipGiftResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UnEquipGiftResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static UnEquipGiftResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UnEquipGiftResponse) PARSER.parseFrom(data);
        }

        public static UnEquipGiftResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UnEquipGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UnEquipGiftResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UnEquipGiftResponse) PARSER.parseFrom(data);
        }

        public static UnEquipGiftResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UnEquipGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UnEquipGiftResponse parseFrom(InputStream input) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseFrom(input);
        }

        public static UnEquipGiftResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static UnEquipGiftResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseDelimitedFrom(input);
        }

        public static UnEquipGiftResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UnEquipGiftResponse parseFrom(CodedInputStream input) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseFrom(input);
        }

        public static UnEquipGiftResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UnEquipGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UnEquipGiftResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.UnEquipGiftResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UnEquipGiftResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UnEquipGiftResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UnEquipGiftResponse_descriptor;
            }

            public GoddessHandler.UnEquipGiftResponse getDefaultInstanceForType() {
                return GoddessHandler.UnEquipGiftResponse.getDefaultInstance();
            }

            public GoddessHandler.UnEquipGiftResponse build() {
                GoddessHandler.UnEquipGiftResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.UnEquipGiftResponse buildPartial() {
                GoddessHandler.UnEquipGiftResponse result = new GoddessHandler.UnEquipGiftResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UnEquipGiftResponse)
                    return mergeFrom((GoddessHandler.UnEquipGiftResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.UnEquipGiftResponse other) {
                if (other == GoddessHandler.UnEquipGiftResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UnEquipGiftResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UnEquipGiftResponse) GoddessHandler.UnEquipGiftResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UnEquipGiftResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.UnEquipGiftResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class EquipGiftResponse
            extends GeneratedMessage
            implements EquipGiftResponseOrBuilder {
        private static final EquipGiftResponse defaultInstance = new EquipGiftResponse(true);
        private final UnknownFieldSet unknownFields;

        private EquipGiftResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EquipGiftResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EquipGiftResponse getDefaultInstance() {
            return defaultInstance;
        }

        public EquipGiftResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EquipGiftResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_EquipGiftResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_EquipGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipGiftResponse.class, Builder.class);
        }

        public static Parser<EquipGiftResponse> PARSER = (Parser<EquipGiftResponse>) new AbstractParser<EquipGiftResponse>() {
            public GoddessHandler.EquipGiftResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.EquipGiftResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EquipGiftResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EquipGiftResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EquipGiftResponse) PARSER.parseFrom(data);
        }

        public static EquipGiftResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGiftResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EquipGiftResponse) PARSER.parseFrom(data);
        }

        public static EquipGiftResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EquipGiftResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EquipGiftResponse parseFrom(InputStream input) throws IOException {
            return (EquipGiftResponse) PARSER.parseFrom(input);
        }

        public static EquipGiftResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EquipGiftResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (EquipGiftResponse) PARSER.parseDelimitedFrom(input);
        }

        public static EquipGiftResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EquipGiftResponse parseFrom(CodedInputStream input) throws IOException {
            return (EquipGiftResponse) PARSER.parseFrom(input);
        }

        public static EquipGiftResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EquipGiftResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EquipGiftResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.EquipGiftResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.EquipGiftResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.EquipGiftResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_EquipGiftResponse_descriptor;
            }

            public GoddessHandler.EquipGiftResponse getDefaultInstanceForType() {
                return GoddessHandler.EquipGiftResponse.getDefaultInstance();
            }

            public GoddessHandler.EquipGiftResponse build() {
                GoddessHandler.EquipGiftResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.EquipGiftResponse buildPartial() {
                GoddessHandler.EquipGiftResponse result = new GoddessHandler.EquipGiftResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.EquipGiftResponse)
                    return mergeFrom((GoddessHandler.EquipGiftResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.EquipGiftResponse other) {
                if (other == GoddessHandler.EquipGiftResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.EquipGiftResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.EquipGiftResponse) GoddessHandler.EquipGiftResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.EquipGiftResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.EquipGiftResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessAddProp
            extends GeneratedMessage
            implements GoddessAddPropOrBuilder {
        private static final GoddessAddProp defaultInstance = new GoddessAddProp(true);
        private final UnknownFieldSet unknownFields;

        private GoddessAddProp(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessAddProp(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessAddProp getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessAddProp getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessAddProp(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.name_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.addValue_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessAddProp_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessAddProp_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessAddProp.class, Builder.class);
        }

        public static Parser<GoddessAddProp> PARSER = (Parser<GoddessAddProp>) new AbstractParser<GoddessAddProp>() {
            public GoddessHandler.GoddessAddProp parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessAddProp(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private Object name_;
        public static final int ADDVALUE_FIELD_NUMBER = 2;
        private int addValue_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessAddProp> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAddValue() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getAddValue() {
            return this.addValue_;
        }

        private void initFields() {
            this.name_ = "";
            this.addValue_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAddValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.addValue_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.addValue_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessAddProp parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessAddProp) PARSER.parseFrom(data);
        }

        public static GoddessAddProp parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessAddProp) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessAddProp parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessAddProp) PARSER.parseFrom(data);
        }

        public static GoddessAddProp parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessAddProp) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessAddProp parseFrom(InputStream input) throws IOException {
            return (GoddessAddProp) PARSER.parseFrom(input);
        }

        public static GoddessAddProp parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessAddProp) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessAddProp parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessAddProp) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessAddProp parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessAddProp) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessAddProp parseFrom(CodedInputStream input) throws IOException {
            return (GoddessAddProp) PARSER.parseFrom(input);
        }

        public static GoddessAddProp parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessAddProp) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessAddProp prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessAddPropOrBuilder {
            private int bitField0_;
            private Object name_;
            private int addValue_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessAddProp_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessAddProp_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessAddProp.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessAddProp.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.addValue_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessAddProp_descriptor;
            }

            public GoddessHandler.GoddessAddProp getDefaultInstanceForType() {
                return GoddessHandler.GoddessAddProp.getDefaultInstance();
            }

            public GoddessHandler.GoddessAddProp build() {
                GoddessHandler.GoddessAddProp result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessAddProp buildPartial() {
                GoddessHandler.GoddessAddProp result = new GoddessHandler.GoddessAddProp(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.addValue_ = this.addValue_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessAddProp)
                    return mergeFrom((GoddessHandler.GoddessAddProp) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessAddProp other) {
                if (other == GoddessHandler.GoddessAddProp.getDefaultInstance()) return this;
                if (other.hasName()) {
                    this.bitField0_ |= 0x1;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasAddValue()) setAddValue(other.getAddValue());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) return false;
                if (!hasAddValue()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessAddProp parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessAddProp) GoddessHandler.GoddessAddProp.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessAddProp) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.name_ = GoddessHandler.GoddessAddProp.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasAddValue() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getAddValue() {
                return this.addValue_;
            }

            public Builder setAddValue(int value) {
                this.bitField0_ |= 0x2;
                this.addValue_ = value;
                onChanged();
                return this;
            }

            public Builder clearAddValue() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.addValue_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessUpgradeStruct
            extends GeneratedMessage
            implements GoddessUpgradeStructOrBuilder {
        private static final GoddessUpgradeStruct defaultInstance = new GoddessUpgradeStruct(true);
        private final UnknownFieldSet unknownFields;

        private GoddessUpgradeStruct(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessUpgradeStruct(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessUpgradeStruct getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessUpgradeStruct getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessUpgradeStruct(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    GoddessHandler.GoddessSkill.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.actionCount_ = input.readInt32();
                            break;
                        case 18:
                            if ((mutable_bitField0_ & 0x2) != 2) {
                                this.addProps_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.addProps_.add(input.readMessage(GoddessHandler.GoddessAddProp.PARSER, extensionRegistry));
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x2) == 2) subBuilder = this.skill_.toBuilder();
                            this.skill_ = (GoddessHandler.GoddessSkill) input.readMessage(GoddessHandler.GoddessSkill.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.skill_);
                                this.skill_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x2;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x2) == 2) this.addProps_ = Collections.unmodifiableList(this.addProps_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessUpgradeStruct_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessUpgradeStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessUpgradeStruct.class, Builder.class);
        }

        public static Parser<GoddessUpgradeStruct> PARSER = (Parser<GoddessUpgradeStruct>) new AbstractParser<GoddessUpgradeStruct>() {
            public GoddessHandler.GoddessUpgradeStruct parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessUpgradeStruct(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ACTIONCOUNT_FIELD_NUMBER = 1;
        private int actionCount_;
        public static final int ADDPROPS_FIELD_NUMBER = 2;
        private List<GoddessHandler.GoddessAddProp> addProps_;
        public static final int SKILL_FIELD_NUMBER = 3;
        private GoddessHandler.GoddessSkill skill_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessUpgradeStruct> getParserForType() {
            return PARSER;
        }

        public boolean hasActionCount() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getActionCount() {
            return this.actionCount_;
        }

        public List<GoddessHandler.GoddessAddProp> getAddPropsList() {
            return this.addProps_;
        }

        public List<? extends GoddessHandler.GoddessAddPropOrBuilder> getAddPropsOrBuilderList() {
            return (List) this.addProps_;
        }

        public int getAddPropsCount() {
            return this.addProps_.size();
        }

        static {
            defaultInstance.initFields();
        }


        public GoddessHandler.GoddessAddProp getAddProps(int index) {
            return this.addProps_.get(index);
        }


        public GoddessHandler.GoddessAddPropOrBuilder getAddPropsOrBuilder(int index) {
            return this.addProps_.get(index);
        }


        public boolean hasSkill() {
            return ((this.bitField0_ & 0x2) == 2);
        }


        public GoddessHandler.GoddessSkill getSkill() {
            return this.skill_;
        }


        public GoddessHandler.GoddessSkillOrBuilder getSkillOrBuilder() {
            return this.skill_;
        }


        private void initFields() {
            this.actionCount_ = 0;
            this.addProps_ = Collections.emptyList();
            this.skill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasActionCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getAddPropsCount(); i++) {
                if (!getAddProps(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasSkill() && !getSkill().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.actionCount_);
            }
            for (int i = 0; i < this.addProps_.size(); i++) {
                output.writeMessage(2, (MessageLite) this.addProps_.get(i));
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeMessage(3, (MessageLite) this.skill_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.actionCount_);
            }
            for (int i = 0; i < this.addProps_.size(); i++) {
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.addProps_.get(i));
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.skill_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GoddessUpgradeStruct parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(data);
        }


        public static GoddessUpgradeStruct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessUpgradeStruct parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(data);
        }


        public static GoddessUpgradeStruct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessUpgradeStruct parseFrom(InputStream input) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(input);
        }


        public static GoddessUpgradeStruct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GoddessUpgradeStruct parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseDelimitedFrom(input);
        }


        public static GoddessUpgradeStruct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GoddessUpgradeStruct parseFrom(CodedInputStream input) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(input);
        }


        public static GoddessUpgradeStruct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessUpgradeStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GoddessUpgradeStruct prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GoddessUpgradeStructOrBuilder {
            private int bitField0_;

            private int actionCount_;

            private List<GoddessHandler.GoddessAddProp> addProps_;

            private RepeatedFieldBuilder<GoddessHandler.GoddessAddProp, GoddessHandler.GoddessAddProp.Builder, GoddessHandler.GoddessAddPropOrBuilder> addPropsBuilder_;

            private GoddessHandler.GoddessSkill skill_;

            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> skillBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessUpgradeStruct_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessUpgradeStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessUpgradeStruct.class, Builder.class);
            }


            private Builder() {
                this.addProps_ = Collections.emptyList();
                this.skill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.addProps_ = Collections.emptyList();
                this.skill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessUpgradeStruct.alwaysUseFieldBuilders) {
                    getAddPropsFieldBuilder();
                    getSkillFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.actionCount_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.addPropsBuilder_ == null) {
                    this.addProps_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.addPropsBuilder_.clear();
                }
                if (this.skillBuilder_ == null) {
                    this.skill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                } else {
                    this.skillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessUpgradeStruct_descriptor;
            }

            public GoddessHandler.GoddessUpgradeStruct getDefaultInstanceForType() {
                return GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
            }

            public GoddessHandler.GoddessUpgradeStruct build() {
                GoddessHandler.GoddessUpgradeStruct result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public GoddessHandler.GoddessUpgradeStruct buildPartial() {
                GoddessHandler.GoddessUpgradeStruct result = new GoddessHandler.GoddessUpgradeStruct(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.actionCount_ = this.actionCount_;
                if (this.addPropsBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2) {
                        this.addProps_ = Collections.unmodifiableList(this.addProps_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.addProps_ = this.addProps_;
                } else {
                    result.addProps_ = this.addPropsBuilder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x2;
                }
                if (this.skillBuilder_ == null) {
                    result.skill_ = this.skill_;
                } else {
                    result.skill_ = (GoddessHandler.GoddessSkill) this.skillBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessUpgradeStruct) {
                    return mergeFrom((GoddessHandler.GoddessUpgradeStruct) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessUpgradeStruct other) {
                if (other == GoddessHandler.GoddessUpgradeStruct.getDefaultInstance()) {
                    return this;
                }
                if (other.hasActionCount()) {
                    setActionCount(other.getActionCount());
                }
                if (this.addPropsBuilder_ == null) {
                    if (!other.addProps_.isEmpty()) {
                        if (this.addProps_.isEmpty()) {
                            this.addProps_ = other.addProps_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        } else {
                            ensureAddPropsIsMutable();
                            this.addProps_.addAll(other.addProps_);
                        }
                        onChanged();
                    }
                } else if (!other.addProps_.isEmpty()) {
                    if (this.addPropsBuilder_.isEmpty()) {
                        this.addPropsBuilder_.dispose();
                        this.addPropsBuilder_ = null;
                        this.addProps_ = other.addProps_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.addPropsBuilder_ = GoddessHandler.GoddessUpgradeStruct.alwaysUseFieldBuilders ? getAddPropsFieldBuilder() : null;
                    } else {
                        this.addPropsBuilder_.addAllMessages(other.addProps_);
                    }
                }
                if (other.hasSkill()) {
                    mergeSkill(other.getSkill());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasActionCount()) {
                    return false;
                }
                for (int i = 0; i < getAddPropsCount(); i++) {
                    if (!getAddProps(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasSkill() && !getSkill().isInitialized()) {
                    return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessUpgradeStruct parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessUpgradeStruct) GoddessHandler.GoddessUpgradeStruct.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessUpgradeStruct) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            public boolean hasActionCount() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getActionCount() {
                return this.actionCount_;
            }

            public Builder setActionCount(int value) {
                this.bitField0_ |= 0x1;
                this.actionCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearActionCount() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.actionCount_ = 0;
                onChanged();
                return this;
            }

            private void ensureAddPropsIsMutable() {
                if ((this.bitField0_ & 0x2) != 2) {
                    this.addProps_ = new ArrayList<>(this.addProps_);
                    this.bitField0_ |= 0x2;
                }
            }

            public List<GoddessHandler.GoddessAddProp> getAddPropsList() {
                if (this.addPropsBuilder_ == null) {
                    return Collections.unmodifiableList(this.addProps_);
                }
                return this.addPropsBuilder_.getMessageList();
            }

            public int getAddPropsCount() {
                if (this.addPropsBuilder_ == null) {
                    return this.addProps_.size();
                }
                return this.addPropsBuilder_.getCount();
            }

            public GoddessHandler.GoddessAddProp getAddProps(int index) {
                if (this.addPropsBuilder_ == null) {
                    return this.addProps_.get(index);
                }
                return (GoddessHandler.GoddessAddProp) this.addPropsBuilder_.getMessage(index);
            }

            public Builder setAddProps(int index, GoddessHandler.GoddessAddProp value) {
                if (this.addPropsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAddPropsIsMutable();
                    this.addProps_.set(index, value);
                    onChanged();
                } else {
                    this.addPropsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setAddProps(int index, GoddessHandler.GoddessAddProp.Builder builderForValue) {
                if (this.addPropsBuilder_ == null) {
                    ensureAddPropsIsMutable();
                    this.addProps_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.addPropsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAddProps(GoddessHandler.GoddessAddProp value) {
                if (this.addPropsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAddPropsIsMutable();
                    this.addProps_.add(value);
                    onChanged();
                } else {
                    this.addPropsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addAddProps(int index, GoddessHandler.GoddessAddProp value) {
                if (this.addPropsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAddPropsIsMutable();
                    this.addProps_.add(index, value);
                    onChanged();
                } else {
                    this.addPropsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addAddProps(GoddessHandler.GoddessAddProp.Builder builderForValue) {
                if (this.addPropsBuilder_ == null) {
                    ensureAddPropsIsMutable();
                    this.addProps_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.addPropsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addAddProps(int index, GoddessHandler.GoddessAddProp.Builder builderForValue) {
                if (this.addPropsBuilder_ == null) {
                    ensureAddPropsIsMutable();
                    this.addProps_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.addPropsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllAddProps(Iterable<? extends GoddessHandler.GoddessAddProp> values) {
                if (this.addPropsBuilder_ == null) {
                    ensureAddPropsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.addProps_);
                    onChanged();
                } else {
                    this.addPropsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearAddProps() {
                if (this.addPropsBuilder_ == null) {
                    this.addProps_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    onChanged();
                } else {
                    this.addPropsBuilder_.clear();
                }
                return this;
            }

            public Builder removeAddProps(int index) {
                if (this.addPropsBuilder_ == null) {
                    ensureAddPropsIsMutable();
                    this.addProps_.remove(index);
                    onChanged();
                } else {
                    this.addPropsBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessAddProp.Builder getAddPropsBuilder(int index) {
                return (GoddessHandler.GoddessAddProp.Builder) getAddPropsFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessAddPropOrBuilder getAddPropsOrBuilder(int index) {
                if (this.addPropsBuilder_ == null) {
                    return this.addProps_.get(index);
                }
                return (GoddessHandler.GoddessAddPropOrBuilder) this.addPropsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessAddPropOrBuilder> getAddPropsOrBuilderList() {
                if (this.addPropsBuilder_ != null) {
                    return this.addPropsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List) this.addProps_);
            }

            public GoddessHandler.GoddessAddProp.Builder addAddPropsBuilder() {
                return (GoddessHandler.GoddessAddProp.Builder) getAddPropsFieldBuilder().addBuilder(GoddessHandler.GoddessAddProp.getDefaultInstance());
            }

            public GoddessHandler.GoddessAddProp.Builder addAddPropsBuilder(int index) {
                return (GoddessHandler.GoddessAddProp.Builder) getAddPropsFieldBuilder().addBuilder(index, GoddessHandler.GoddessAddProp.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessAddProp.Builder> getAddPropsBuilderList() {
                return getAddPropsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessAddProp, GoddessHandler.GoddessAddProp.Builder, GoddessHandler.GoddessAddPropOrBuilder> getAddPropsFieldBuilder() {
                if (this.addPropsBuilder_ == null) {
                    this.addPropsBuilder_ = new RepeatedFieldBuilder(this.addProps_, ((this.bitField0_ & 0x2) == 2), getParentForChildren(), isClean());
                    this.addProps_ = null;
                }
                return this.addPropsBuilder_;
            }

            public boolean hasSkill() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GoddessHandler.GoddessSkill getSkill() {
                if (this.skillBuilder_ == null) {
                    return this.skill_;
                }
                return (GoddessHandler.GoddessSkill) this.skillBuilder_.getMessage();
            }

            public Builder setSkill(GoddessHandler.GoddessSkill value) {
                if (this.skillBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.skill_ = value;
                    onChanged();
                } else {
                    this.skillBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setSkill(GoddessHandler.GoddessSkill.Builder builderForValue) {
                if (this.skillBuilder_ == null) {
                    this.skill_ = builderForValue.build();
                    onChanged();
                } else {
                    this.skillBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeSkill(GoddessHandler.GoddessSkill value) {
                if (this.skillBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.skill_ != GoddessHandler.GoddessSkill.getDefaultInstance()) {
                        this.skill_ = GoddessHandler.GoddessSkill.newBuilder(this.skill_).mergeFrom(value).buildPartial();
                    } else {
                        this.skill_ = value;
                    }
                    onChanged();
                } else {
                    this.skillBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearSkill() {
                if (this.skillBuilder_ == null) {
                    this.skill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                    onChanged();
                } else {
                    this.skillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GoddessHandler.GoddessSkill.Builder getSkillBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GoddessHandler.GoddessSkill.Builder) getSkillFieldBuilder().getBuilder();
            }

            public GoddessHandler.GoddessSkillOrBuilder getSkillOrBuilder() {
                if (this.skillBuilder_ != null) {
                    return (GoddessHandler.GoddessSkillOrBuilder) this.skillBuilder_.getMessageOrBuilder();
                }
                return this.skill_;
            }

            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> getSkillFieldBuilder() {
                if (this.skillBuilder_ == null) {
                    this.skillBuilder_ = new SingleFieldBuilder(getSkill(), getParentForChildren(), isClean());
                    this.skill_ = null;
                }
                return this.skillBuilder_;
            }
        }
    }

    public static final class GoddessIntimacyStruct
            extends GeneratedMessage
            implements GoddessIntimacyStructOrBuilder {
        private static final GoddessIntimacyStruct defaultInstance = new GoddessIntimacyStruct(true);
        private final UnknownFieldSet unknownFields;

        private GoddessIntimacyStruct(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessIntimacyStruct(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessIntimacyStruct getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessIntimacyStruct getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessIntimacyStruct(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.intimacy_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.intimacyLevel_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.intimacyStage_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.needIntimacy_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessIntimacyStruct_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessIntimacyStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessIntimacyStruct.class, Builder.class);
        }

        public static Parser<GoddessIntimacyStruct> PARSER = (Parser<GoddessIntimacyStruct>) new AbstractParser<GoddessIntimacyStruct>() {
            public GoddessHandler.GoddessIntimacyStruct parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessIntimacyStruct(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int INTIMACY_FIELD_NUMBER = 1;
        private int intimacy_;
        public static final int INTIMACYLEVEL_FIELD_NUMBER = 2;
        private int intimacyLevel_;
        public static final int INTIMACYSTAGE_FIELD_NUMBER = 3;
        private int intimacyStage_;
        public static final int NEEDINTIMACY_FIELD_NUMBER = 4;
        private int needIntimacy_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessIntimacyStruct> getParserForType() {
            return PARSER;
        }

        public boolean hasIntimacy() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getIntimacy() {
            return this.intimacy_;
        }

        public boolean hasIntimacyLevel() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        static {
            defaultInstance.initFields();
        }


        public int getIntimacyLevel() {
            return this.intimacyLevel_;
        }


        public boolean hasIntimacyStage() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public int getIntimacyStage() {
            return this.intimacyStage_;
        }


        public boolean hasNeedIntimacy() {
            return ((this.bitField0_ & 0x8) == 8);
        }


        public int getNeedIntimacy() {
            return this.needIntimacy_;
        }


        private void initFields() {
            this.intimacy_ = 0;
            this.intimacyLevel_ = 0;
            this.intimacyStage_ = 0;
            this.needIntimacy_ = 0;
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasIntimacy()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIntimacyLevel()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIntimacyStage()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasNeedIntimacy()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.intimacy_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeInt32(2, this.intimacyLevel_);
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeInt32(3, this.intimacyStage_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                output.writeInt32(4, this.needIntimacy_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.intimacy_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeInt32Size(2, this.intimacyLevel_);
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeInt32Size(3, this.intimacyStage_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                size += CodedOutputStream.computeInt32Size(4, this.needIntimacy_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GoddessIntimacyStruct parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(data);
        }


        public static GoddessIntimacyStruct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessIntimacyStruct parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(data);
        }


        public static GoddessIntimacyStruct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessIntimacyStruct parseFrom(InputStream input) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(input);
        }


        public static GoddessIntimacyStruct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GoddessIntimacyStruct parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseDelimitedFrom(input);
        }


        public static GoddessIntimacyStruct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GoddessIntimacyStruct parseFrom(CodedInputStream input) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(input);
        }


        public static GoddessIntimacyStruct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessIntimacyStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GoddessIntimacyStruct prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GoddessIntimacyStructOrBuilder {
            private int bitField0_;


            private int intimacy_;


            private int intimacyLevel_;


            private int intimacyStage_;


            private int needIntimacy_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessIntimacyStruct_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessIntimacyStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessIntimacyStruct.class, Builder.class);
            }


            private Builder() {
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessIntimacyStruct.alwaysUseFieldBuilders) ;
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.intimacy_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.intimacyLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.intimacyStage_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.needIntimacy_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessIntimacyStruct_descriptor;
            }


            public GoddessHandler.GoddessIntimacyStruct getDefaultInstanceForType() {
                return GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
            }


            public GoddessHandler.GoddessIntimacyStruct build() {
                GoddessHandler.GoddessIntimacyStruct result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.GoddessIntimacyStruct buildPartial() {
                GoddessHandler.GoddessIntimacyStruct result = new GoddessHandler.GoddessIntimacyStruct(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.intimacy_ = this.intimacy_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.intimacyLevel_ = this.intimacyLevel_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                result.intimacyStage_ = this.intimacyStage_;
                if ((from_bitField0_ & 0x8) == 8) {
                    to_bitField0_ |= 0x8;
                }
                result.needIntimacy_ = this.needIntimacy_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessIntimacyStruct) {
                    return mergeFrom((GoddessHandler.GoddessIntimacyStruct) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.GoddessIntimacyStruct other) {
                if (other == GoddessHandler.GoddessIntimacyStruct.getDefaultInstance()) {
                    return this;
                }
                if (other.hasIntimacy()) {
                    setIntimacy(other.getIntimacy());
                }
                if (other.hasIntimacyLevel()) {
                    setIntimacyLevel(other.getIntimacyLevel());
                }
                if (other.hasIntimacyStage()) {
                    setIntimacyStage(other.getIntimacyStage());
                }
                if (other.hasNeedIntimacy()) {
                    setNeedIntimacy(other.getNeedIntimacy());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasIntimacy()) {
                    return false;
                }
                if (!hasIntimacyLevel()) {
                    return false;
                }
                if (!hasIntimacyStage()) {
                    return false;
                }
                if (!hasNeedIntimacy()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessIntimacyStruct parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessIntimacyStruct) GoddessHandler.GoddessIntimacyStruct.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessIntimacyStruct) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasIntimacy() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getIntimacy() {
                return this.intimacy_;
            }


            public Builder setIntimacy(int value) {
                this.bitField0_ |= 0x1;
                this.intimacy_ = value;
                onChanged();
                return this;
            }


            public Builder clearIntimacy() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.intimacy_ = 0;
                onChanged();
                return this;
            }


            public boolean hasIntimacyLevel() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public int getIntimacyLevel() {
                return this.intimacyLevel_;
            }


            public Builder setIntimacyLevel(int value) {
                this.bitField0_ |= 0x2;
                this.intimacyLevel_ = value;
                onChanged();
                return this;
            }


            public Builder clearIntimacyLevel() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.intimacyLevel_ = 0;
                onChanged();
                return this;
            }


            public boolean hasIntimacyStage() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public int getIntimacyStage() {
                return this.intimacyStage_;
            }


            public Builder setIntimacyStage(int value) {
                this.bitField0_ |= 0x4;
                this.intimacyStage_ = value;
                onChanged();
                return this;
            }


            public Builder clearIntimacyStage() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.intimacyStage_ = 0;
                onChanged();
                return this;
            }


            public boolean hasNeedIntimacy() {
                return ((this.bitField0_ & 0x8) == 8);
            }


            public int getNeedIntimacy() {
                return this.needIntimacy_;
            }


            public Builder setNeedIntimacy(int value) {
                this.bitField0_ |= 0x8;
                this.needIntimacy_ = value;
                onChanged();
                return this;
            }


            public Builder clearNeedIntimacy() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.needIntimacy_ = 0;
                onChanged();
                return this;
            }
        }
    }


    public static final class CommInfo
            extends GeneratedMessage
            implements CommInfoOrBuilder {
        private static final CommInfo defaultInstance = new CommInfo(true);
        private final UnknownFieldSet unknownFields;

        private CommInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private CommInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static CommInfo getDefaultInstance() {
            return defaultInstance;
        }

        public CommInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CommInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.type_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.exp_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.cost_ = input.readInt32();
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.name_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_CommInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_CommInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CommInfo.class, Builder.class);
        }

        public static Parser<CommInfo> PARSER = (Parser<CommInfo>) new AbstractParser<CommInfo>() {
            public GoddessHandler.CommInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.CommInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        public static final int EXP_FIELD_NUMBER = 2;
        private int exp_;
        public static final int COST_FIELD_NUMBER = 3;
        private int cost_;
        public static final int NAME_FIELD_NUMBER = 4;
        private Object name_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<CommInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasType() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasExp() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        static {
            defaultInstance.initFields();
        }


        public int getExp() {
            return this.exp_;
        }


        public boolean hasCost() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public int getCost() {
            return this.cost_;
        }


        public boolean hasName() {
            return ((this.bitField0_ & 0x8) == 8);
        }


        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.name_ = s;
            }
            return s;
        }


        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        private void initFields() {
            this.type_ = 0;
            this.exp_ = 0;
            this.cost_ = 0;
            this.name_ = "";
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasType()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasExp()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCost()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.type_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeInt32(2, this.exp_);
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeInt32(3, this.cost_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                output.writeBytes(4, getNameBytes());
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.type_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeInt32Size(2, this.exp_);
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeInt32Size(3, this.cost_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                size += CodedOutputStream.computeBytesSize(4, getNameBytes());
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static CommInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CommInfo) PARSER.parseFrom(data);
        }


        public static CommInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CommInfo) PARSER.parseFrom(data, extensionRegistry);
        }


        public static CommInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CommInfo) PARSER.parseFrom(data);
        }


        public static CommInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CommInfo) PARSER.parseFrom(data, extensionRegistry);
        }


        public static CommInfo parseFrom(InputStream input) throws IOException {
            return (CommInfo) PARSER.parseFrom(input);
        }


        public static CommInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CommInfo) PARSER.parseFrom(input, extensionRegistry);
        }


        public static CommInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (CommInfo) PARSER.parseDelimitedFrom(input);
        }


        public static CommInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CommInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static CommInfo parseFrom(CodedInputStream input) throws IOException {
            return (CommInfo) PARSER.parseFrom(input);
        }


        public static CommInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CommInfo) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(CommInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.CommInfoOrBuilder {
            private int bitField0_;


            private int type_;


            private int exp_;


            private int cost_;


            private Object name_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_CommInfo_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_CommInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.CommInfo.class, Builder.class);
            }


            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.CommInfo.alwaysUseFieldBuilders) ;
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.exp_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.cost_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_CommInfo_descriptor;
            }


            public GoddessHandler.CommInfo getDefaultInstanceForType() {
                return GoddessHandler.CommInfo.getDefaultInstance();
            }


            public GoddessHandler.CommInfo build() {
                GoddessHandler.CommInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.CommInfo buildPartial() {
                GoddessHandler.CommInfo result = new GoddessHandler.CommInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.type_ = this.type_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.exp_ = this.exp_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                result.cost_ = this.cost_;
                if ((from_bitField0_ & 0x8) == 8) {
                    to_bitField0_ |= 0x8;
                }
                result.name_ = this.name_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.CommInfo) {
                    return mergeFrom((GoddessHandler.CommInfo) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.CommInfo other) {
                if (other == GoddessHandler.CommInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasExp()) {
                    setExp(other.getExp());
                }
                if (other.hasCost()) {
                    setCost(other.getCost());
                }
                if (other.hasName()) {
                    this.bitField0_ |= 0x8;
                    this.name_ = other.name_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasType()) {
                    return false;
                }
                if (!hasExp()) {
                    return false;
                }
                if (!hasCost()) {
                    return false;
                }
                if (!hasName()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.CommInfo parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.CommInfo) GoddessHandler.CommInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.CommInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasType() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getType() {
                return this.type_;
            }


            public Builder setType(int value) {
                this.bitField0_ |= 0x1;
                this.type_ = value;
                onChanged();
                return this;
            }


            public Builder clearType() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.type_ = 0;
                onChanged();
                return this;
            }


            public boolean hasExp() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public int getExp() {
                return this.exp_;
            }


            public Builder setExp(int value) {
                this.bitField0_ |= 0x2;
                this.exp_ = value;
                onChanged();
                return this;
            }


            public Builder clearExp() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.exp_ = 0;
                onChanged();
                return this;
            }


            public boolean hasCost() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public int getCost() {
                return this.cost_;
            }


            public Builder setCost(int value) {
                this.bitField0_ |= 0x4;
                this.cost_ = value;
                onChanged();
                return this;
            }


            public Builder clearCost() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.cost_ = 0;
                onChanged();
                return this;
            }


            public boolean hasName() {
                return ((this.bitField0_ & 0x8) == 8);
            }


            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.name_ = s;
                    }
                    return s;
                }
                return (String) ref;
            }


            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }


            public Builder setName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x8;
                this.name_ = value;
                onChanged();
                return this;
            }


            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.name_ = GoddessHandler.CommInfo.getDefaultInstance().getName();
                onChanged();
                return this;
            }


            public Builder setNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x8;
                this.name_ = value;
                onChanged();
                return this;
            }
        }
    }


    public static final class GoddessCommStruct
            extends GeneratedMessage
            implements GoddessCommStructOrBuilder {
        private static final GoddessCommStruct defaultInstance = new GoddessCommStruct(true);
        private final UnknownFieldSet unknownFields;

        private GoddessCommStruct(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessCommStruct(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessCommStruct getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessCommStruct getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessCommStruct(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.curCommCount_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.maxCommCount_ = input.readInt32();
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.commInfo_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.commInfo_.add(input.readMessage(GoddessHandler.CommInfo.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.commInfo_ = Collections.unmodifiableList(this.commInfo_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessCommStruct_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessCommStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessCommStruct.class, Builder.class);
        }

        public static Parser<GoddessCommStruct> PARSER = (Parser<GoddessCommStruct>) new AbstractParser<GoddessCommStruct>() {
            public GoddessHandler.GoddessCommStruct parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessCommStruct(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int CURCOMMCOUNT_FIELD_NUMBER = 1;
        private int curCommCount_;
        public static final int MAXCOMMCOUNT_FIELD_NUMBER = 2;
        private int maxCommCount_;
        public static final int COMMINFO_FIELD_NUMBER = 3;
        private List<GoddessHandler.CommInfo> commInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessCommStruct> getParserForType() {
            return PARSER;
        }

        public boolean hasCurCommCount() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getCurCommCount() {
            return this.curCommCount_;
        }

        public boolean hasMaxCommCount() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getMaxCommCount() {
            return this.maxCommCount_;
        }

        static {
            defaultInstance.initFields();
        }


        public List<GoddessHandler.CommInfo> getCommInfoList() {
            return this.commInfo_;
        }


        public List<? extends GoddessHandler.CommInfoOrBuilder> getCommInfoOrBuilderList() {
            return (List) this.commInfo_;
        }


        public int getCommInfoCount() {
            return this.commInfo_.size();
        }


        public GoddessHandler.CommInfo getCommInfo(int index) {
            return this.commInfo_.get(index);
        }


        public GoddessHandler.CommInfoOrBuilder getCommInfoOrBuilder(int index) {
            return this.commInfo_.get(index);
        }


        private void initFields() {
            this.curCommCount_ = 0;
            this.maxCommCount_ = 0;
            this.commInfo_ = Collections.emptyList();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasCurCommCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMaxCommCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getCommInfoCount(); i++) {
                if (!getCommInfo(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.curCommCount_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeInt32(2, this.maxCommCount_);
            }
            for (int i = 0; i < this.commInfo_.size(); i++) {
                output.writeMessage(3, (MessageLite) this.commInfo_.get(i));
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.curCommCount_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeInt32Size(2, this.maxCommCount_);
            }
            for (int i = 0; i < this.commInfo_.size(); i++) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.commInfo_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GoddessCommStruct parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessCommStruct) PARSER.parseFrom(data);
        }


        public static GoddessCommStruct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessCommStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessCommStruct parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessCommStruct) PARSER.parseFrom(data);
        }


        public static GoddessCommStruct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessCommStruct) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessCommStruct parseFrom(InputStream input) throws IOException {
            return (GoddessCommStruct) PARSER.parseFrom(input);
        }


        public static GoddessCommStruct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessCommStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GoddessCommStruct parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessCommStruct) PARSER.parseDelimitedFrom(input);
        }


        public static GoddessCommStruct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessCommStruct) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GoddessCommStruct parseFrom(CodedInputStream input) throws IOException {
            return (GoddessCommStruct) PARSER.parseFrom(input);
        }


        public static GoddessCommStruct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessCommStruct) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GoddessCommStruct prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GoddessCommStructOrBuilder {
            private int bitField0_;


            private int curCommCount_;


            private int maxCommCount_;


            private List<GoddessHandler.CommInfo> commInfo_;


            private RepeatedFieldBuilder<GoddessHandler.CommInfo, GoddessHandler.CommInfo.Builder, GoddessHandler.CommInfoOrBuilder> commInfoBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessCommStruct_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessCommStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessCommStruct.class, Builder.class);
            }


            private Builder() {
                this.commInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.commInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessCommStruct.alwaysUseFieldBuilders) {
                    getCommInfoFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.curCommCount_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.maxCommCount_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.commInfoBuilder_ == null) {
                    this.commInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.commInfoBuilder_.clear();
                }
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessCommStruct_descriptor;
            }


            public GoddessHandler.GoddessCommStruct getDefaultInstanceForType() {
                return GoddessHandler.GoddessCommStruct.getDefaultInstance();
            }


            public GoddessHandler.GoddessCommStruct build() {
                GoddessHandler.GoddessCommStruct result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.GoddessCommStruct buildPartial() {
                GoddessHandler.GoddessCommStruct result = new GoddessHandler.GoddessCommStruct(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.curCommCount_ = this.curCommCount_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.maxCommCount_ = this.maxCommCount_;
                if (this.commInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.commInfo_ = Collections.unmodifiableList(this.commInfo_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.commInfo_ = this.commInfo_;
                } else {
                    result.commInfo_ = this.commInfoBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessCommStruct) {
                    return mergeFrom((GoddessHandler.GoddessCommStruct) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.GoddessCommStruct other) {
                if (other == GoddessHandler.GoddessCommStruct.getDefaultInstance()) {
                    return this;
                }
                if (other.hasCurCommCount()) {
                    setCurCommCount(other.getCurCommCount());
                }
                if (other.hasMaxCommCount()) {
                    setMaxCommCount(other.getMaxCommCount());
                }
                if (this.commInfoBuilder_ == null) {
                    if (!other.commInfo_.isEmpty()) {
                        if (this.commInfo_.isEmpty()) {
                            this.commInfo_ = other.commInfo_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureCommInfoIsMutable();
                            this.commInfo_.addAll(other.commInfo_);
                        }
                        onChanged();
                    }
                } else if (!other.commInfo_.isEmpty()) {
                    if (this.commInfoBuilder_.isEmpty()) {
                        this.commInfoBuilder_.dispose();
                        this.commInfoBuilder_ = null;
                        this.commInfo_ = other.commInfo_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.commInfoBuilder_ = GoddessHandler.GoddessCommStruct.alwaysUseFieldBuilders ? getCommInfoFieldBuilder() : null;
                    } else {
                        this.commInfoBuilder_.addAllMessages(other.commInfo_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasCurCommCount()) {
                    return false;
                }
                if (!hasMaxCommCount()) {
                    return false;
                }
                for (int i = 0; i < getCommInfoCount(); i++) {
                    if (!getCommInfo(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessCommStruct parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessCommStruct) GoddessHandler.GoddessCommStruct.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessCommStruct) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasCurCommCount() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getCurCommCount() {
                return this.curCommCount_;
            }


            public Builder setCurCommCount(int value) {
                this.bitField0_ |= 0x1;
                this.curCommCount_ = value;
                onChanged();
                return this;
            }


            public Builder clearCurCommCount() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.curCommCount_ = 0;
                onChanged();
                return this;
            }


            public boolean hasMaxCommCount() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public int getMaxCommCount() {
                return this.maxCommCount_;
            }


            public Builder setMaxCommCount(int value) {
                this.bitField0_ |= 0x2;
                this.maxCommCount_ = value;
                onChanged();
                return this;
            }


            public Builder clearMaxCommCount() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.maxCommCount_ = 0;
                onChanged();
                return this;
            }


            private void ensureCommInfoIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.commInfo_ = new ArrayList<>(this.commInfo_);
                    this.bitField0_ |= 0x4;
                }
            }


            public List<GoddessHandler.CommInfo> getCommInfoList() {
                if (this.commInfoBuilder_ == null) {
                    return Collections.unmodifiableList(this.commInfo_);
                }
                return this.commInfoBuilder_.getMessageList();
            }


            public int getCommInfoCount() {
                if (this.commInfoBuilder_ == null) {
                    return this.commInfo_.size();
                }
                return this.commInfoBuilder_.getCount();
            }


            public GoddessHandler.CommInfo getCommInfo(int index) {
                if (this.commInfoBuilder_ == null) {
                    return this.commInfo_.get(index);
                }
                return (GoddessHandler.CommInfo) this.commInfoBuilder_.getMessage(index);
            }


            public Builder setCommInfo(int index, GoddessHandler.CommInfo value) {
                if (this.commInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCommInfoIsMutable();
                    this.commInfo_.set(index, value);
                    onChanged();
                } else {
                    this.commInfoBuilder_.setMessage(index, value);
                }
                return this;
            }


            public Builder setCommInfo(int index, GoddessHandler.CommInfo.Builder builderForValue) {
                if (this.commInfoBuilder_ == null) {
                    ensureCommInfoIsMutable();
                    this.commInfo_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.commInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }


            public Builder addCommInfo(GoddessHandler.CommInfo value) {
                if (this.commInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCommInfoIsMutable();
                    this.commInfo_.add(value);
                    onChanged();
                } else {
                    this.commInfoBuilder_.addMessage(value);
                }
                return this;
            }


            public Builder addCommInfo(int index, GoddessHandler.CommInfo value) {
                if (this.commInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCommInfoIsMutable();
                    this.commInfo_.add(index, value);
                    onChanged();
                } else {
                    this.commInfoBuilder_.addMessage(index, value);
                }
                return this;
            }


            public Builder addCommInfo(GoddessHandler.CommInfo.Builder builderForValue) {
                if (this.commInfoBuilder_ == null) {
                    ensureCommInfoIsMutable();
                    this.commInfo_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.commInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }


            public Builder addCommInfo(int index, GoddessHandler.CommInfo.Builder builderForValue) {
                if (this.commInfoBuilder_ == null) {
                    ensureCommInfoIsMutable();
                    this.commInfo_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.commInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }


            public Builder addAllCommInfo(Iterable<? extends GoddessHandler.CommInfo> values) {
                if (this.commInfoBuilder_ == null) {
                    ensureCommInfoIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.commInfo_);
                    onChanged();
                } else {
                    this.commInfoBuilder_.addAllMessages(values);
                }
                return this;
            }


            public Builder clearCommInfo() {
                if (this.commInfoBuilder_ == null) {
                    this.commInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.commInfoBuilder_.clear();
                }
                return this;
            }


            public Builder removeCommInfo(int index) {
                if (this.commInfoBuilder_ == null) {
                    ensureCommInfoIsMutable();
                    this.commInfo_.remove(index);
                    onChanged();
                } else {
                    this.commInfoBuilder_.remove(index);
                }
                return this;
            }


            public GoddessHandler.CommInfo.Builder getCommInfoBuilder(int index) {
                return (GoddessHandler.CommInfo.Builder) getCommInfoFieldBuilder().getBuilder(index);
            }


            public GoddessHandler.CommInfoOrBuilder getCommInfoOrBuilder(int index) {
                if (this.commInfoBuilder_ == null) {
                    return this.commInfo_.get(index);
                }
                return (GoddessHandler.CommInfoOrBuilder) this.commInfoBuilder_.getMessageOrBuilder(index);
            }


            public List<? extends GoddessHandler.CommInfoOrBuilder> getCommInfoOrBuilderList() {
                if (this.commInfoBuilder_ != null) {
                    return this.commInfoBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List) this.commInfo_);
            }


            public GoddessHandler.CommInfo.Builder addCommInfoBuilder() {
                return (GoddessHandler.CommInfo.Builder) getCommInfoFieldBuilder().addBuilder(GoddessHandler.CommInfo.getDefaultInstance());
            }


            public GoddessHandler.CommInfo.Builder addCommInfoBuilder(int index) {
                return (GoddessHandler.CommInfo.Builder) getCommInfoFieldBuilder().addBuilder(index, GoddessHandler.CommInfo.getDefaultInstance());
            }


            public List<GoddessHandler.CommInfo.Builder> getCommInfoBuilderList() {
                return getCommInfoFieldBuilder().getBuilderList();
            }


            private RepeatedFieldBuilder<GoddessHandler.CommInfo, GoddessHandler.CommInfo.Builder, GoddessHandler.CommInfoOrBuilder> getCommInfoFieldBuilder() {
                if (this.commInfoBuilder_ == null) {
                    this.commInfoBuilder_ = new RepeatedFieldBuilder(this.commInfo_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.commInfo_ = null;
                }
                return this.commInfoBuilder_;
            }
        }
    }


    public static final class GetCommInfoResponse
            extends GeneratedMessage
            implements GetCommInfoResponseOrBuilder {
        private static final GetCommInfoResponse defaultInstance = new GetCommInfoResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetCommInfoResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetCommInfoResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetCommInfoResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetCommInfoResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetCommInfoResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GoddessHandler.GoddessCommStruct.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.s2CCommData_.toBuilder();
                            this.s2CCommData_ = (GoddessHandler.GoddessCommStruct) input.readMessage(GoddessHandler.GoddessCommStruct.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.s2CCommData_);
                                this.s2CCommData_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetCommInfoResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetCommInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetCommInfoResponse.class, Builder.class);
        }

        public static Parser<GetCommInfoResponse> PARSER = (Parser<GetCommInfoResponse>) new AbstractParser<GetCommInfoResponse>() {
            public GoddessHandler.GetCommInfoResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetCommInfoResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_COMMDATA_FIELD_NUMBER = 3;
        private GoddessHandler.GoddessCommStruct s2CCommData_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetCommInfoResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        static {
            defaultInstance.initFields();
        }


        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasS2CCommData() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public GoddessHandler.GoddessCommStruct getS2CCommData() {
            return this.s2CCommData_;
        }


        public GoddessHandler.GoddessCommStructOrBuilder getS2CCommDataOrBuilder() {
            return this.s2CCommData_;
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2CCommData_ = GoddessHandler.GoddessCommStruct.getDefaultInstance();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CCommData() && !getS2CCommData().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeMessage(3, (MessageLite) this.s2CCommData_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2CCommData_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GetCommInfoResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetCommInfoResponse) PARSER.parseFrom(data);
        }


        public static GetCommInfoResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetCommInfoResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetCommInfoResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetCommInfoResponse) PARSER.parseFrom(data);
        }


        public static GetCommInfoResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetCommInfoResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetCommInfoResponse parseFrom(InputStream input) throws IOException {
            return (GetCommInfoResponse) PARSER.parseFrom(input);
        }


        public static GetCommInfoResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GetCommInfoResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetCommInfoResponse) PARSER.parseDelimitedFrom(input);
        }


        public static GetCommInfoResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GetCommInfoResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetCommInfoResponse) PARSER.parseFrom(input);
        }


        public static GetCommInfoResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetCommInfoResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GetCommInfoResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GetCommInfoResponseOrBuilder {
            private int bitField0_;


            private int s2CCode_;


            private Object s2CMsg_;


            private GoddessHandler.GoddessCommStruct s2CCommData_;


            private SingleFieldBuilder<GoddessHandler.GoddessCommStruct, GoddessHandler.GoddessCommStruct.Builder, GoddessHandler.GoddessCommStructOrBuilder> s2CCommDataBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoResponse_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetCommInfoResponse.class, Builder.class);
            }


            private Builder() {
                this.s2CMsg_ = "";
                this.s2CCommData_ = GoddessHandler.GoddessCommStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CCommData_ = GoddessHandler.GoddessCommStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetCommInfoResponse.alwaysUseFieldBuilders) {
                    getS2CCommDataFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2CCommDataBuilder_ == null) {
                    this.s2CCommData_ = GoddessHandler.GoddessCommStruct.getDefaultInstance();
                } else {
                    this.s2CCommDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetCommInfoResponse_descriptor;
            }


            public GoddessHandler.GetCommInfoResponse getDefaultInstanceForType() {
                return GoddessHandler.GetCommInfoResponse.getDefaultInstance();
            }


            public GoddessHandler.GetCommInfoResponse build() {
                GoddessHandler.GetCommInfoResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.GetCommInfoResponse buildPartial() {
                GoddessHandler.GetCommInfoResponse result = new GoddessHandler.GetCommInfoResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                if (this.s2CCommDataBuilder_ == null) {
                    result.s2CCommData_ = this.s2CCommData_;
                } else {
                    result.s2CCommData_ = (GoddessHandler.GoddessCommStruct) this.s2CCommDataBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetCommInfoResponse) {
                    return mergeFrom((GoddessHandler.GetCommInfoResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.GetCommInfoResponse other) {
                if (other == GoddessHandler.GetCommInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (other.hasS2CCode()) {
                    setS2CCode(other.getS2CCode());
                }
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasS2CCommData()) {
                    mergeS2CCommData(other.getS2CCommData());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasS2CCode()) {
                    return false;
                }
                if (hasS2CCommData() && !getS2CCommData().isInitialized()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetCommInfoResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetCommInfoResponse) GoddessHandler.GetCommInfoResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetCommInfoResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getS2CCode() {
                return this.s2CCode_;
            }


            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.s2CMsg_ = s;
                    }
                    return s;
                }
                return (String) ref;
            }


            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }


            public Builder setS2CMsg(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.GetCommInfoResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }


            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public boolean hasS2CCommData() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public GoddessHandler.GoddessCommStruct getS2CCommData() {
                if (this.s2CCommDataBuilder_ == null) {
                    return this.s2CCommData_;
                }
                return (GoddessHandler.GoddessCommStruct) this.s2CCommDataBuilder_.getMessage();
            }


            public Builder setS2CCommData(GoddessHandler.GoddessCommStruct value) {
                if (this.s2CCommDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CCommData_ = value;
                    onChanged();
                } else {
                    this.s2CCommDataBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder setS2CCommData(GoddessHandler.GoddessCommStruct.Builder builderForValue) {
                if (this.s2CCommDataBuilder_ == null) {
                    this.s2CCommData_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CCommDataBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder mergeS2CCommData(GoddessHandler.GoddessCommStruct value) {
                if (this.s2CCommDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.s2CCommData_ != GoddessHandler.GoddessCommStruct.getDefaultInstance()) {
                        this.s2CCommData_ = GoddessHandler.GoddessCommStruct.newBuilder(this.s2CCommData_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CCommData_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CCommDataBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder clearS2CCommData() {
                if (this.s2CCommDataBuilder_ == null) {
                    this.s2CCommData_ = GoddessHandler.GoddessCommStruct.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CCommDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }


            public GoddessHandler.GoddessCommStruct.Builder getS2CCommDataBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GoddessHandler.GoddessCommStruct.Builder) getS2CCommDataFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessCommStructOrBuilder getS2CCommDataOrBuilder() {
                if (this.s2CCommDataBuilder_ != null) {
                    return (GoddessHandler.GoddessCommStructOrBuilder) this.s2CCommDataBuilder_.getMessageOrBuilder();
                }
                return this.s2CCommData_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessCommStruct, GoddessHandler.GoddessCommStruct.Builder, GoddessHandler.GoddessCommStructOrBuilder> getS2CCommDataFieldBuilder() {
                if (this.s2CCommDataBuilder_ == null) {
                    this.s2CCommDataBuilder_ = new SingleFieldBuilder(getS2CCommData(), getParentForChildren(), isClean());
                    this.s2CCommData_ = null;
                }
                return this.s2CCommDataBuilder_;
            }
        }
    }


    public static final class UpIntimacyResponse
            extends GeneratedMessage
            implements UpIntimacyResponseOrBuilder {
        private static final UpIntimacyResponse defaultInstance = new UpIntimacyResponse(true);
        private final UnknownFieldSet unknownFields;

        private UpIntimacyResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UpIntimacyResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UpIntimacyResponse getDefaultInstance() {
            return defaultInstance;
        }

        public UpIntimacyResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UpIntimacyResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GoddessHandler.GoddessIntimacyStruct.Builder builder;
                    GoddessHandler.GoddessUpgradeStruct.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.s2CStar_ = input.readInt32();
                            break;
                        case 34:
                            builder = null;
                            if ((this.bitField0_ & 0x8) == 8) builder = this.s2CIntimacyData_.toBuilder();
                            this.s2CIntimacyData_ = (GoddessHandler.GoddessIntimacyStruct) input.readMessage(GoddessHandler.GoddessIntimacyStruct.PARSER, extensionRegistry);
                            if (builder != null) {
                                builder.mergeFrom(this.s2CIntimacyData_);
                                this.s2CIntimacyData_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 0x8;
                            break;
                        case 42:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x10) == 16) subBuilder = this.s2CUpGradeInfo_.toBuilder();
                            this.s2CUpGradeInfo_ = (GoddessHandler.GoddessUpgradeStruct) input.readMessage(GoddessHandler.GoddessUpgradeStruct.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.s2CUpGradeInfo_);
                                this.s2CUpGradeInfo_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x10;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UpIntimacyResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UpIntimacyResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpIntimacyResponse.class, Builder.class);
        }

        public static Parser<UpIntimacyResponse> PARSER = (Parser<UpIntimacyResponse>) new AbstractParser<UpIntimacyResponse>() {
            public GoddessHandler.UpIntimacyResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UpIntimacyResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_STAR_FIELD_NUMBER = 3;
        private int s2CStar_;
        public static final int S2C_INTIMACYDATA_FIELD_NUMBER = 4;
        private GoddessHandler.GoddessIntimacyStruct s2CIntimacyData_;
        public static final int S2C_UPGRADEINFO_FIELD_NUMBER = 5;
        private GoddessHandler.GoddessUpgradeStruct s2CUpGradeInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UpIntimacyResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        static {
            defaultInstance.initFields();
        }


        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasS2CStar() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public int getS2CStar() {
            return this.s2CStar_;
        }


        public boolean hasS2CIntimacyData() {
            return ((this.bitField0_ & 0x8) == 8);
        }


        public GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData() {
            return this.s2CIntimacyData_;
        }


        public GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder() {
            return this.s2CIntimacyData_;
        }


        public boolean hasS2CUpGradeInfo() {
            return ((this.bitField0_ & 0x10) == 16);
        }


        public GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo() {
            return this.s2CUpGradeInfo_;
        }


        public GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder() {
            return this.s2CUpGradeInfo_;
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2CStar_ = 0;
            this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
            this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CIntimacyData() && !getS2CIntimacyData().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CUpGradeInfo() && !getS2CUpGradeInfo().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeInt32(3, this.s2CStar_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                output.writeMessage(4, (MessageLite) this.s2CIntimacyData_);
            }
            if ((this.bitField0_ & 0x10) == 16) {
                output.writeMessage(5, (MessageLite) this.s2CUpGradeInfo_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeInt32Size(3, this.s2CStar_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.s2CIntimacyData_);
            }
            if ((this.bitField0_ & 0x10) == 16) {
                size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.s2CUpGradeInfo_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static UpIntimacyResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UpIntimacyResponse) PARSER.parseFrom(data);
        }


        public static UpIntimacyResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpIntimacyResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static UpIntimacyResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UpIntimacyResponse) PARSER.parseFrom(data);
        }


        public static UpIntimacyResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpIntimacyResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static UpIntimacyResponse parseFrom(InputStream input) throws IOException {
            return (UpIntimacyResponse) PARSER.parseFrom(input);
        }


        public static UpIntimacyResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static UpIntimacyResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (UpIntimacyResponse) PARSER.parseDelimitedFrom(input);
        }


        public static UpIntimacyResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static UpIntimacyResponse parseFrom(CodedInputStream input) throws IOException {
            return (UpIntimacyResponse) PARSER.parseFrom(input);
        }


        public static UpIntimacyResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpIntimacyResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(UpIntimacyResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.UpIntimacyResponseOrBuilder {
            private int bitField0_;


            private int s2CCode_;


            private Object s2CMsg_;


            private int s2CStar_;


            private GoddessHandler.GoddessIntimacyStruct s2CIntimacyData_;


            private SingleFieldBuilder<GoddessHandler.GoddessIntimacyStruct, GoddessHandler.GoddessIntimacyStruct.Builder, GoddessHandler.GoddessIntimacyStructOrBuilder> s2CIntimacyDataBuilder_;


            private GoddessHandler.GoddessUpgradeStruct s2CUpGradeInfo_;


            private SingleFieldBuilder<GoddessHandler.GoddessUpgradeStruct, GoddessHandler.GoddessUpgradeStruct.Builder, GoddessHandler.GoddessUpgradeStructOrBuilder> s2CUpGradeInfoBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyResponse_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UpIntimacyResponse.class, Builder.class);
            }


            private Builder() {
                this.s2CMsg_ = "";
                this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UpIntimacyResponse.alwaysUseFieldBuilders) {
                    getS2CIntimacyDataFieldBuilder();
                    getS2CUpGradeInfoFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CStar_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                } else {
                    this.s2CIntimacyDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                } else {
                    this.s2CUpGradeInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UpIntimacyResponse_descriptor;
            }


            public GoddessHandler.UpIntimacyResponse getDefaultInstanceForType() {
                return GoddessHandler.UpIntimacyResponse.getDefaultInstance();
            }


            public GoddessHandler.UpIntimacyResponse build() {
                GoddessHandler.UpIntimacyResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.UpIntimacyResponse buildPartial() {
                GoddessHandler.UpIntimacyResponse result = new GoddessHandler.UpIntimacyResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                result.s2CStar_ = this.s2CStar_;
                if ((from_bitField0_ & 0x8) == 8) {
                    to_bitField0_ |= 0x8;
                }
                if (this.s2CIntimacyDataBuilder_ == null) {
                    result.s2CIntimacyData_ = this.s2CIntimacyData_;
                } else {
                    result.s2CIntimacyData_ = (GoddessHandler.GoddessIntimacyStruct) this.s2CIntimacyDataBuilder_.build();
                }
                if ((from_bitField0_ & 0x10) == 16) {
                    to_bitField0_ |= 0x10;
                }
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    result.s2CUpGradeInfo_ = this.s2CUpGradeInfo_;
                } else {
                    result.s2CUpGradeInfo_ = (GoddessHandler.GoddessUpgradeStruct) this.s2CUpGradeInfoBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UpIntimacyResponse) {
                    return mergeFrom((GoddessHandler.UpIntimacyResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.UpIntimacyResponse other) {
                if (other == GoddessHandler.UpIntimacyResponse.getDefaultInstance()) {
                    return this;
                }
                if (other.hasS2CCode()) {
                    setS2CCode(other.getS2CCode());
                }
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasS2CStar()) {
                    setS2CStar(other.getS2CStar());
                }
                if (other.hasS2CIntimacyData()) {
                    mergeS2CIntimacyData(other.getS2CIntimacyData());
                }
                if (other.hasS2CUpGradeInfo()) {
                    mergeS2CUpGradeInfo(other.getS2CUpGradeInfo());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasS2CCode()) {
                    return false;
                }
                if (hasS2CIntimacyData() && !getS2CIntimacyData().isInitialized()) {
                    return false;
                }
                if (hasS2CUpGradeInfo() && !getS2CUpGradeInfo().isInitialized()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UpIntimacyResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UpIntimacyResponse) GoddessHandler.UpIntimacyResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UpIntimacyResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getS2CCode() {
                return this.s2CCode_;
            }


            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.s2CMsg_ = s;
                    }
                    return s;
                }
                return (String) ref;
            }


            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }


            public Builder setS2CMsg(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.UpIntimacyResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }


            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public boolean hasS2CStar() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public int getS2CStar() {
                return this.s2CStar_;
            }


            public Builder setS2CStar(int value) {
                this.bitField0_ |= 0x4;
                this.s2CStar_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CStar() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.s2CStar_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CIntimacyData() {
                return ((this.bitField0_ & 0x8) == 8);
            }


            public GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    return this.s2CIntimacyData_;
                }
                return (GoddessHandler.GoddessIntimacyStruct) this.s2CIntimacyDataBuilder_.getMessage();
            }


            public Builder setS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct value) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CIntimacyData_ = value;
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder setS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct.Builder builderForValue) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder mergeS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct value) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8 && this.s2CIntimacyData_ != GoddessHandler.GoddessIntimacyStruct.getDefaultInstance()) {
                        this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.newBuilder(this.s2CIntimacyData_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CIntimacyData_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder clearS2CIntimacyData() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }


            public GoddessHandler.GoddessIntimacyStruct.Builder getS2CIntimacyDataBuilder() {
                this.bitField0_ |= 0x8;
                onChanged();
                return (GoddessHandler.GoddessIntimacyStruct.Builder) getS2CIntimacyDataFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder() {
                if (this.s2CIntimacyDataBuilder_ != null) {
                    return (GoddessHandler.GoddessIntimacyStructOrBuilder) this.s2CIntimacyDataBuilder_.getMessageOrBuilder();
                }
                return this.s2CIntimacyData_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessIntimacyStruct, GoddessHandler.GoddessIntimacyStruct.Builder, GoddessHandler.GoddessIntimacyStructOrBuilder> getS2CIntimacyDataFieldBuilder() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyDataBuilder_ = new SingleFieldBuilder(getS2CIntimacyData(), getParentForChildren(), isClean());
                    this.s2CIntimacyData_ = null;
                }
                return this.s2CIntimacyDataBuilder_;
            }


            public boolean hasS2CUpGradeInfo() {
                return ((this.bitField0_ & 0x10) == 16);
            }


            public GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    return this.s2CUpGradeInfo_;
                }
                return (GoddessHandler.GoddessUpgradeStruct) this.s2CUpGradeInfoBuilder_.getMessage();
            }


            public Builder setS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct value) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CUpGradeInfo_ = value;
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder setS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct.Builder builderForValue) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder mergeS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct value) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) == 16 && this.s2CUpGradeInfo_ != GoddessHandler.GoddessUpgradeStruct.getDefaultInstance()) {
                        this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.newBuilder(this.s2CUpGradeInfo_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CUpGradeInfo_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder clearS2CUpGradeInfo() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }


            public GoddessHandler.GoddessUpgradeStruct.Builder getS2CUpGradeInfoBuilder() {
                this.bitField0_ |= 0x10;
                onChanged();
                return (GoddessHandler.GoddessUpgradeStruct.Builder) getS2CUpGradeInfoFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder() {
                if (this.s2CUpGradeInfoBuilder_ != null) {
                    return (GoddessHandler.GoddessUpgradeStructOrBuilder) this.s2CUpGradeInfoBuilder_.getMessageOrBuilder();
                }
                return this.s2CUpGradeInfo_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessUpgradeStruct, GoddessHandler.GoddessUpgradeStruct.Builder, GoddessHandler.GoddessUpgradeStructOrBuilder> getS2CUpGradeInfoFieldBuilder() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfoBuilder_ = new SingleFieldBuilder(getS2CUpGradeInfo(), getParentForChildren(), isClean());
                    this.s2CUpGradeInfo_ = null;
                }
                return this.s2CUpGradeInfoBuilder_;
            }
        }
    }


    public static final class UpStarResponse
            extends GeneratedMessage
            implements UpStarResponseOrBuilder {
        private static final UpStarResponse defaultInstance = new UpStarResponse(true);
        private final UnknownFieldSet unknownFields;

        private UpStarResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UpStarResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static UpStarResponse getDefaultInstance() {
            return defaultInstance;
        }

        public UpStarResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UpStarResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GoddessHandler.GoddessIntimacyStruct.Builder builder;
                    GoddessHandler.GoddessUpgradeStruct.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.s2CStar_ = input.readInt32();
                            break;
                        case 34:
                            builder = null;
                            if ((this.bitField0_ & 0x8) == 8) builder = this.s2CIntimacyData_.toBuilder();
                            this.s2CIntimacyData_ = (GoddessHandler.GoddessIntimacyStruct) input.readMessage(GoddessHandler.GoddessIntimacyStruct.PARSER, extensionRegistry);
                            if (builder != null) {
                                builder.mergeFrom(this.s2CIntimacyData_);
                                this.s2CIntimacyData_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 0x8;
                            break;
                        case 42:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x10) == 16) subBuilder = this.s2CUpGradeInfo_.toBuilder();
                            this.s2CUpGradeInfo_ = (GoddessHandler.GoddessUpgradeStruct) input.readMessage(GoddessHandler.GoddessUpgradeStruct.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.s2CUpGradeInfo_);
                                this.s2CUpGradeInfo_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x10;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_UpStarResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_UpStarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpStarResponse.class, Builder.class);
        }

        public static Parser<UpStarResponse> PARSER = (Parser<UpStarResponse>) new AbstractParser<UpStarResponse>() {
            public GoddessHandler.UpStarResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.UpStarResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_STAR_FIELD_NUMBER = 3;
        private int s2CStar_;
        public static final int S2C_INTIMACYDATA_FIELD_NUMBER = 4;
        private GoddessHandler.GoddessIntimacyStruct s2CIntimacyData_;
        public static final int S2C_UPGRADEINFO_FIELD_NUMBER = 5;
        private GoddessHandler.GoddessUpgradeStruct s2CUpGradeInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<UpStarResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        static {
            defaultInstance.initFields();
        }


        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasS2CStar() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public int getS2CStar() {
            return this.s2CStar_;
        }


        public boolean hasS2CIntimacyData() {
            return ((this.bitField0_ & 0x8) == 8);
        }


        public GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData() {
            return this.s2CIntimacyData_;
        }


        public GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder() {
            return this.s2CIntimacyData_;
        }


        public boolean hasS2CUpGradeInfo() {
            return ((this.bitField0_ & 0x10) == 16);
        }


        public GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo() {
            return this.s2CUpGradeInfo_;
        }


        public GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder() {
            return this.s2CUpGradeInfo_;
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2CStar_ = 0;
            this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
            this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CIntimacyData() && !getS2CIntimacyData().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CUpGradeInfo() && !getS2CUpGradeInfo().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeInt32(3, this.s2CStar_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                output.writeMessage(4, (MessageLite) this.s2CIntimacyData_);
            }
            if ((this.bitField0_ & 0x10) == 16) {
                output.writeMessage(5, (MessageLite) this.s2CUpGradeInfo_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeInt32Size(3, this.s2CStar_);
            }
            if ((this.bitField0_ & 0x8) == 8) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.s2CIntimacyData_);
            }
            if ((this.bitField0_ & 0x10) == 16) {
                size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.s2CUpGradeInfo_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static UpStarResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UpStarResponse) PARSER.parseFrom(data);
        }


        public static UpStarResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpStarResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static UpStarResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UpStarResponse) PARSER.parseFrom(data);
        }


        public static UpStarResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UpStarResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static UpStarResponse parseFrom(InputStream input) throws IOException {
            return (UpStarResponse) PARSER.parseFrom(input);
        }


        public static UpStarResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static UpStarResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (UpStarResponse) PARSER.parseDelimitedFrom(input);
        }


        public static UpStarResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static UpStarResponse parseFrom(CodedInputStream input) throws IOException {
            return (UpStarResponse) PARSER.parseFrom(input);
        }


        public static UpStarResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UpStarResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(UpStarResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.UpStarResponseOrBuilder {
            private int bitField0_;

            private int s2CCode_;

            private Object s2CMsg_;

            private int s2CStar_;

            private GoddessHandler.GoddessIntimacyStruct s2CIntimacyData_;

            private SingleFieldBuilder<GoddessHandler.GoddessIntimacyStruct, GoddessHandler.GoddessIntimacyStruct.Builder, GoddessHandler.GoddessIntimacyStructOrBuilder> s2CIntimacyDataBuilder_;

            private GoddessHandler.GoddessUpgradeStruct s2CUpGradeInfo_;

            private SingleFieldBuilder<GoddessHandler.GoddessUpgradeStruct, GoddessHandler.GoddessUpgradeStruct.Builder, GoddessHandler.GoddessUpgradeStructOrBuilder> s2CUpGradeInfoBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_UpStarResponse_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_UpStarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.UpStarResponse.class, Builder.class);
            }


            private Builder() {
                this.s2CMsg_ = "";
                this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.UpStarResponse.alwaysUseFieldBuilders) {
                    getS2CIntimacyDataFieldBuilder();
                    getS2CUpGradeInfoFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CStar_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                } else {
                    this.s2CIntimacyDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                } else {
                    this.s2CUpGradeInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_UpStarResponse_descriptor;
            }


            public GoddessHandler.UpStarResponse getDefaultInstanceForType() {
                return GoddessHandler.UpStarResponse.getDefaultInstance();
            }


            public GoddessHandler.UpStarResponse build() {
                GoddessHandler.UpStarResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.UpStarResponse buildPartial() {
                GoddessHandler.UpStarResponse result = new GoddessHandler.UpStarResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                result.s2CStar_ = this.s2CStar_;
                if ((from_bitField0_ & 0x8) == 8) {
                    to_bitField0_ |= 0x8;
                }
                if (this.s2CIntimacyDataBuilder_ == null) {
                    result.s2CIntimacyData_ = this.s2CIntimacyData_;
                } else {
                    result.s2CIntimacyData_ = (GoddessHandler.GoddessIntimacyStruct) this.s2CIntimacyDataBuilder_.build();
                }
                if ((from_bitField0_ & 0x10) == 16) {
                    to_bitField0_ |= 0x10;
                }
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    result.s2CUpGradeInfo_ = this.s2CUpGradeInfo_;
                } else {
                    result.s2CUpGradeInfo_ = (GoddessHandler.GoddessUpgradeStruct) this.s2CUpGradeInfoBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.UpStarResponse) {
                    return mergeFrom((GoddessHandler.UpStarResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.UpStarResponse other) {
                if (other == GoddessHandler.UpStarResponse.getDefaultInstance()) {
                    return this;
                }
                if (other.hasS2CCode()) {
                    setS2CCode(other.getS2CCode());
                }
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasS2CStar()) {
                    setS2CStar(other.getS2CStar());
                }
                if (other.hasS2CIntimacyData()) {
                    mergeS2CIntimacyData(other.getS2CIntimacyData());
                }
                if (other.hasS2CUpGradeInfo()) {
                    mergeS2CUpGradeInfo(other.getS2CUpGradeInfo());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasS2CCode()) {
                    return false;
                }
                if (hasS2CIntimacyData() && !getS2CIntimacyData().isInitialized()) {
                    return false;
                }
                if (hasS2CUpGradeInfo() && !getS2CUpGradeInfo().isInitialized()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.UpStarResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.UpStarResponse) GoddessHandler.UpStarResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.UpStarResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getS2CCode() {
                return this.s2CCode_;
            }


            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.s2CMsg_ = s;
                    }
                    return s;
                }
                return (String) ref;
            }


            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }


            public Builder setS2CMsg(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.UpStarResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }


            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public boolean hasS2CStar() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public int getS2CStar() {
                return this.s2CStar_;
            }


            public Builder setS2CStar(int value) {
                this.bitField0_ |= 0x4;
                this.s2CStar_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CStar() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.s2CStar_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CIntimacyData() {
                return ((this.bitField0_ & 0x8) == 8);
            }


            public GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    return this.s2CIntimacyData_;
                }
                return (GoddessHandler.GoddessIntimacyStruct) this.s2CIntimacyDataBuilder_.getMessage();
            }


            public Builder setS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct value) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CIntimacyData_ = value;
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder setS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct.Builder builderForValue) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder mergeS2CIntimacyData(GoddessHandler.GoddessIntimacyStruct value) {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8 && this.s2CIntimacyData_ != GoddessHandler.GoddessIntimacyStruct.getDefaultInstance()) {
                        this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.newBuilder(this.s2CIntimacyData_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CIntimacyData_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }


            public Builder clearS2CIntimacyData() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyData_ = GoddessHandler.GoddessIntimacyStruct.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CIntimacyDataBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }


            public GoddessHandler.GoddessIntimacyStruct.Builder getS2CIntimacyDataBuilder() {
                this.bitField0_ |= 0x8;
                onChanged();
                return (GoddessHandler.GoddessIntimacyStruct.Builder) getS2CIntimacyDataFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder() {
                if (this.s2CIntimacyDataBuilder_ != null) {
                    return (GoddessHandler.GoddessIntimacyStructOrBuilder) this.s2CIntimacyDataBuilder_.getMessageOrBuilder();
                }
                return this.s2CIntimacyData_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessIntimacyStruct, GoddessHandler.GoddessIntimacyStruct.Builder, GoddessHandler.GoddessIntimacyStructOrBuilder> getS2CIntimacyDataFieldBuilder() {
                if (this.s2CIntimacyDataBuilder_ == null) {
                    this.s2CIntimacyDataBuilder_ = new SingleFieldBuilder(getS2CIntimacyData(), getParentForChildren(), isClean());
                    this.s2CIntimacyData_ = null;
                }
                return this.s2CIntimacyDataBuilder_;
            }


            public boolean hasS2CUpGradeInfo() {
                return ((this.bitField0_ & 0x10) == 16);
            }


            public GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    return this.s2CUpGradeInfo_;
                }
                return (GoddessHandler.GoddessUpgradeStruct) this.s2CUpGradeInfoBuilder_.getMessage();
            }


            public Builder setS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct value) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CUpGradeInfo_ = value;
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder setS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct.Builder builderForValue) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder mergeS2CUpGradeInfo(GoddessHandler.GoddessUpgradeStruct value) {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x10) == 16 && this.s2CUpGradeInfo_ != GoddessHandler.GoddessUpgradeStruct.getDefaultInstance()) {
                        this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.newBuilder(this.s2CUpGradeInfo_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CUpGradeInfo_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x10;
                return this;
            }


            public Builder clearS2CUpGradeInfo() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfo_ = GoddessHandler.GoddessUpgradeStruct.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CUpGradeInfoBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFEF;
                return this;
            }


            public GoddessHandler.GoddessUpgradeStruct.Builder getS2CUpGradeInfoBuilder() {
                this.bitField0_ |= 0x10;
                onChanged();
                return (GoddessHandler.GoddessUpgradeStruct.Builder) getS2CUpGradeInfoFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder() {
                if (this.s2CUpGradeInfoBuilder_ != null) {
                    return (GoddessHandler.GoddessUpgradeStructOrBuilder) this.s2CUpGradeInfoBuilder_.getMessageOrBuilder();
                }
                return this.s2CUpGradeInfo_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessUpgradeStruct, GoddessHandler.GoddessUpgradeStruct.Builder, GoddessHandler.GoddessUpgradeStructOrBuilder> getS2CUpGradeInfoFieldBuilder() {
                if (this.s2CUpGradeInfoBuilder_ == null) {
                    this.s2CUpGradeInfoBuilder_ = new SingleFieldBuilder(getS2CUpGradeInfo(), getParentForChildren(), isClean());
                    this.s2CUpGradeInfo_ = null;
                }
                return this.s2CUpGradeInfoBuilder_;
            }
        }
    }


    public static final class GetGoddessDetailResponse
            extends GeneratedMessage
            implements GetGoddessDetailResponseOrBuilder {
        private static final GetGoddessDetailResponse defaultInstance = new GetGoddessDetailResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetGoddessDetailResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGoddessDetailResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGoddessDetailResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetGoddessDetailResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGoddessDetailResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GoddessHandler.GoddessDetail.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.s2CGoddess_.toBuilder();
                            this.s2CGoddess_ = (GoddessHandler.GoddessDetail) input.readMessage(GoddessHandler.GoddessDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.s2CGoddess_);
                                this.s2CGoddess_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGoddessDetailResponse.class, Builder.class);
        }

        public static Parser<GetGoddessDetailResponse> PARSER = (Parser<GetGoddessDetailResponse>) new AbstractParser<GetGoddessDetailResponse>() {
            public GoddessHandler.GetGoddessDetailResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetGoddessDetailResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int S2C_GODDESS_FIELD_NUMBER = 3;
        private GoddessHandler.GoddessDetail s2CGoddess_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGoddessDetailResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        static {
            defaultInstance.initFields();
        }


        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasS2CGoddess() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public GoddessHandler.GoddessDetail getS2CGoddess() {
            return this.s2CGoddess_;
        }


        public GoddessHandler.GoddessDetailOrBuilder getS2CGoddessOrBuilder() {
            return this.s2CGoddess_;
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2CGoddess_ = GoddessHandler.GoddessDetail.getDefaultInstance();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasS2CGoddess() && !getS2CGoddess().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeMessage(3, (MessageLite) this.s2CGoddess_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2CGoddess_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GetGoddessDetailResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(data);
        }


        public static GetGoddessDetailResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetGoddessDetailResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(data);
        }


        public static GetGoddessDetailResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetGoddessDetailResponse parseFrom(InputStream input) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(input);
        }


        public static GetGoddessDetailResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GetGoddessDetailResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseDelimitedFrom(input);
        }


        public static GetGoddessDetailResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GetGoddessDetailResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(input);
        }


        public static GetGoddessDetailResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGoddessDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GetGoddessDetailResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GetGoddessDetailResponseOrBuilder {
            private int bitField0_;


            private int s2CCode_;


            private Object s2CMsg_;


            private GoddessHandler.GoddessDetail s2CGoddess_;


            private SingleFieldBuilder<GoddessHandler.GoddessDetail, GoddessHandler.GoddessDetail.Builder, GoddessHandler.GoddessDetailOrBuilder> s2CGoddessBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailResponse_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetGoddessDetailResponse.class, Builder.class);
            }


            private Builder() {
                this.s2CMsg_ = "";
                this.s2CGoddess_ = GoddessHandler.GoddessDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CGoddess_ = GoddessHandler.GoddessDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetGoddessDetailResponse.alwaysUseFieldBuilders) {
                    getS2CGoddessFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2CGoddessBuilder_ == null) {
                    this.s2CGoddess_ = GoddessHandler.GoddessDetail.getDefaultInstance();
                } else {
                    this.s2CGoddessBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetGoddessDetailResponse_descriptor;
            }


            public GoddessHandler.GetGoddessDetailResponse getDefaultInstanceForType() {
                return GoddessHandler.GetGoddessDetailResponse.getDefaultInstance();
            }


            public GoddessHandler.GetGoddessDetailResponse build() {
                GoddessHandler.GetGoddessDetailResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.GetGoddessDetailResponse buildPartial() {
                GoddessHandler.GetGoddessDetailResponse result = new GoddessHandler.GetGoddessDetailResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) {
                    to_bitField0_ |= 0x4;
                }
                if (this.s2CGoddessBuilder_ == null) {
                    result.s2CGoddess_ = this.s2CGoddess_;
                } else {
                    result.s2CGoddess_ = (GoddessHandler.GoddessDetail) this.s2CGoddessBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetGoddessDetailResponse) {
                    return mergeFrom((GoddessHandler.GetGoddessDetailResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.GetGoddessDetailResponse other) {
                if (other == GoddessHandler.GetGoddessDetailResponse.getDefaultInstance()) {
                    return this;
                }
                if (other.hasS2CCode()) {
                    setS2CCode(other.getS2CCode());
                }
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasS2CGoddess()) {
                    mergeS2CGoddess(other.getS2CGoddess());
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasS2CCode()) {
                    return false;
                }
                if (hasS2CGoddess() && !getS2CGoddess().isInitialized()) {
                    return false;
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetGoddessDetailResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetGoddessDetailResponse) GoddessHandler.GetGoddessDetailResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetGoddessDetailResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getS2CCode() {
                return this.s2CCode_;
            }


            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        this.s2CMsg_ = s;
                    }
                    return s;
                }
                return (String) ref;
            }


            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }


            public Builder setS2CMsg(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.GetGoddessDetailResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }


            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }


            public boolean hasS2CGoddess() {
                return ((this.bitField0_ & 0x4) == 4);
            }


            public GoddessHandler.GoddessDetail getS2CGoddess() {
                if (this.s2CGoddessBuilder_ == null) {
                    return this.s2CGoddess_;
                }
                return (GoddessHandler.GoddessDetail) this.s2CGoddessBuilder_.getMessage();
            }


            public Builder setS2CGoddess(GoddessHandler.GoddessDetail value) {
                if (this.s2CGoddessBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.s2CGoddess_ = value;
                    onChanged();
                } else {
                    this.s2CGoddessBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder setS2CGoddess(GoddessHandler.GoddessDetail.Builder builderForValue) {
                if (this.s2CGoddessBuilder_ == null) {
                    this.s2CGoddess_ = builderForValue.build();
                    onChanged();
                } else {
                    this.s2CGoddessBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder mergeS2CGoddess(GoddessHandler.GoddessDetail value) {
                if (this.s2CGoddessBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.s2CGoddess_ != GoddessHandler.GoddessDetail.getDefaultInstance()) {
                        this.s2CGoddess_ = GoddessHandler.GoddessDetail.newBuilder(this.s2CGoddess_).mergeFrom(value).buildPartial();
                    } else {
                        this.s2CGoddess_ = value;
                    }
                    onChanged();
                } else {
                    this.s2CGoddessBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }


            public Builder clearS2CGoddess() {
                if (this.s2CGoddessBuilder_ == null) {
                    this.s2CGoddess_ = GoddessHandler.GoddessDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.s2CGoddessBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }


            public GoddessHandler.GoddessDetail.Builder getS2CGoddessBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GoddessHandler.GoddessDetail.Builder) getS2CGoddessFieldBuilder().getBuilder();
            }


            public GoddessHandler.GoddessDetailOrBuilder getS2CGoddessOrBuilder() {
                if (this.s2CGoddessBuilder_ != null) {
                    return (GoddessHandler.GoddessDetailOrBuilder) this.s2CGoddessBuilder_.getMessageOrBuilder();
                }
                return this.s2CGoddess_;
            }


            private SingleFieldBuilder<GoddessHandler.GoddessDetail, GoddessHandler.GoddessDetail.Builder, GoddessHandler.GoddessDetailOrBuilder> getS2CGoddessFieldBuilder() {
                if (this.s2CGoddessBuilder_ == null) {
                    this.s2CGoddessBuilder_ = new SingleFieldBuilder(getS2CGoddess(), getParentForChildren(), isClean());
                    this.s2CGoddess_ = null;
                }
                return this.s2CGoddessBuilder_;
            }
        }
    }


    public static final class GetAllGoddessResponse
            extends GeneratedMessage
            implements GetAllGoddessResponseOrBuilder {
        private final UnknownFieldSet unknownFields;


        private GetAllGoddessResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }


        private GetAllGoddessResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }


        public static GetAllGoddessResponse getDefaultInstance() {
            return defaultInstance;
        }


        public GetAllGoddessResponse getDefaultInstanceForType() {
            return defaultInstance;
        }


        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }


        private GetAllGoddessResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.s2COnBattleMaxNum_ = input.readInt32();
                            break;
                        case 34:
                            if ((mutable_bitField0_ & 0x8) != 8) {
                                this.s2CGoddesses_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.s2CGoddesses_.add(input.readMessage(GoddessHandler.GoddessBasic.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x8) == 8) {
                    this.s2CGoddesses_ = Collections.unmodifiableList(this.s2CGoddesses_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }


        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GetAllGoddessResponse_descriptor;
        }


        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GetAllGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllGoddessResponse.class, Builder.class);
        }


        public static Parser<GetAllGoddessResponse> PARSER = (Parser<GetAllGoddessResponse>) new AbstractParser<GetAllGoddessResponse>() {
            public GoddessHandler.GetAllGoddessResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GetAllGoddessResponse(input, extensionRegistry);
            }
        };


        private int bitField0_;


        public static final int S2C_CODE_FIELD_NUMBER = 1;


        private int s2CCode_;


        public static final int S2C_MSG_FIELD_NUMBER = 2;


        private Object s2CMsg_;


        public static final int S2C_ON_BATTLE_MAX_NUM_FIELD_NUMBER = 3;


        private int s2COnBattleMaxNum_;


        public static final int S2C_GODDESSES_FIELD_NUMBER = 4;


        private List<GoddessHandler.GoddessBasic> s2CGoddesses_;


        private byte memoizedIsInitialized;


        private int memoizedSerializedSize;


        private static final long serialVersionUID = 0L;


        public Parser<GetAllGoddessResponse> getParserForType() {
            return PARSER;
        }


        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }


        public int getS2CCode() {
            return this.s2CCode_;
        }


        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }


        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.s2CMsg_ = s;
            }
            return s;
        }


        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasS2COnBattleMaxNum() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public int getS2COnBattleMaxNum() {
            return this.s2COnBattleMaxNum_;
        }


        public List<GoddessHandler.GoddessBasic> getS2CGoddessesList() {
            return this.s2CGoddesses_;
        }


        public List<? extends GoddessHandler.GoddessBasicOrBuilder> getS2CGoddessesOrBuilderList() {
            return (List) this.s2CGoddesses_;
        }


        public int getS2CGoddessesCount() {
            return this.s2CGoddesses_.size();
        }


        public GoddessHandler.GoddessBasic getS2CGoddesses(int index) {
            return this.s2CGoddesses_.get(index);
        }


        public GoddessHandler.GoddessBasicOrBuilder getS2CGoddessesOrBuilder(int index) {
            return this.s2CGoddesses_.get(index);
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.s2COnBattleMaxNum_ = 0;
            this.s2CGoddesses_ = Collections.emptyList();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasS2COnBattleMaxNum()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getS2CGoddessesCount(); i++) {
                if (!getS2CGoddesses(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeInt32(3, this.s2COnBattleMaxNum_);
            }
            for (int i = 0; i < this.s2CGoddesses_.size(); i++) {
                output.writeMessage(4, (MessageLite) this.s2CGoddesses_.get(i));
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeInt32Size(3, this.s2COnBattleMaxNum_);
            }
            for (int i = 0; i < this.s2CGoddesses_.size(); i++) {
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.s2CGoddesses_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GetAllGoddessResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetAllGoddessResponse) PARSER.parseFrom(data);
        }


        public static GetAllGoddessResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetAllGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetAllGoddessResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetAllGoddessResponse) PARSER.parseFrom(data);
        }


        public static GetAllGoddessResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetAllGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GetAllGoddessResponse parseFrom(InputStream input) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseFrom(input);
        }


        public static GetAllGoddessResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GetAllGoddessResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseDelimitedFrom(input);
        }


        public static GetAllGoddessResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GetAllGoddessResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseFrom(input);
        }


        private static final GetAllGoddessResponse defaultInstance = new GetAllGoddessResponse(true);

        public static GetAllGoddessResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAllGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetAllGoddessResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GetAllGoddessResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private int s2COnBattleMaxNum_;
            private List<GoddessHandler.GoddessBasic> s2CGoddesses_;
            private RepeatedFieldBuilder<GoddessHandler.GoddessBasic, GoddessHandler.GoddessBasic.Builder, GoddessHandler.GoddessBasicOrBuilder> s2CGoddessesBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GetAllGoddessResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.s2CGoddesses_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.s2CGoddesses_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GetAllGoddessResponse.alwaysUseFieldBuilders) getS2CGoddessesFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2COnBattleMaxNum_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.s2CGoddessesBuilder_ == null) {
                    this.s2CGoddesses_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.s2CGoddessesBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GetAllGoddessResponse_descriptor;
            }

            public GoddessHandler.GetAllGoddessResponse getDefaultInstanceForType() {
                return GoddessHandler.GetAllGoddessResponse.getDefaultInstance();
            }

            public GoddessHandler.GetAllGoddessResponse build() {
                GoddessHandler.GetAllGoddessResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GetAllGoddessResponse buildPartial() {
                GoddessHandler.GetAllGoddessResponse result = new GoddessHandler.GetAllGoddessResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.s2COnBattleMaxNum_ = this.s2COnBattleMaxNum_;
                if (this.s2CGoddessesBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8) {
                        this.s2CGoddesses_ = Collections.unmodifiableList(this.s2CGoddesses_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.s2CGoddesses_ = this.s2CGoddesses_;
                } else {
                    result.s2CGoddesses_ = this.s2CGoddessesBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GetAllGoddessResponse)
                    return mergeFrom((GoddessHandler.GetAllGoddessResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GetAllGoddessResponse other) {
                if (other == GoddessHandler.GetAllGoddessResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasS2COnBattleMaxNum()) setS2COnBattleMaxNum(other.getS2COnBattleMaxNum());
                if (this.s2CGoddessesBuilder_ == null) {
                    if (!other.s2CGoddesses_.isEmpty()) {
                        if (this.s2CGoddesses_.isEmpty()) {
                            this.s2CGoddesses_ = other.s2CGoddesses_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        } else {
                            ensureS2CGoddessesIsMutable();
                            this.s2CGoddesses_.addAll(other.s2CGoddesses_);
                        }
                        onChanged();
                    }
                } else if (!other.s2CGoddesses_.isEmpty()) {
                    if (this.s2CGoddessesBuilder_.isEmpty()) {
                        this.s2CGoddessesBuilder_.dispose();
                        this.s2CGoddessesBuilder_ = null;
                        this.s2CGoddesses_ = other.s2CGoddesses_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.s2CGoddessesBuilder_ = GoddessHandler.GetAllGoddessResponse.alwaysUseFieldBuilders ? getS2CGoddessesFieldBuilder() : null;
                    } else {
                        this.s2CGoddessesBuilder_.addAllMessages(other.s2CGoddesses_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (!hasS2COnBattleMaxNum()) return false;
                for (int i = 0; i < getS2CGoddessesCount(); i++) {
                    if (!getS2CGoddesses(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GetAllGoddessResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GetAllGoddessResponse) GoddessHandler.GetAllGoddessResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GetAllGoddessResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.GetAllGoddessResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasS2COnBattleMaxNum() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getS2COnBattleMaxNum() {
                return this.s2COnBattleMaxNum_;
            }

            public Builder setS2COnBattleMaxNum(int value) {
                this.bitField0_ |= 0x4;
                this.s2COnBattleMaxNum_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2COnBattleMaxNum() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.s2COnBattleMaxNum_ = 0;
                onChanged();
                return this;
            }

            private void ensureS2CGoddessesIsMutable() {
                if ((this.bitField0_ & 0x8) != 8) {
                    this.s2CGoddesses_ = new ArrayList<>(this.s2CGoddesses_);
                    this.bitField0_ |= 0x8;
                }
            }

            public List<GoddessHandler.GoddessBasic> getS2CGoddessesList() {
                if (this.s2CGoddessesBuilder_ == null) return Collections.unmodifiableList(this.s2CGoddesses_);
                return this.s2CGoddessesBuilder_.getMessageList();
            }

            public int getS2CGoddessesCount() {
                if (this.s2CGoddessesBuilder_ == null) return this.s2CGoddesses_.size();
                return this.s2CGoddessesBuilder_.getCount();
            }

            public GoddessHandler.GoddessBasic getS2CGoddesses(int index) {
                if (this.s2CGoddessesBuilder_ == null) return this.s2CGoddesses_.get(index);
                return (GoddessHandler.GoddessBasic) this.s2CGoddessesBuilder_.getMessage(index);
            }

            public Builder setS2CGoddesses(int index, GoddessHandler.GoddessBasic value) {
                if (this.s2CGoddessesBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.set(index, value);
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setS2CGoddesses(int index, GoddessHandler.GoddessBasic.Builder builderForValue) {
                if (this.s2CGoddessesBuilder_ == null) {
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addS2CGoddesses(GoddessHandler.GoddessBasic value) {
                if (this.s2CGoddessesBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.add(value);
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addS2CGoddesses(int index, GoddessHandler.GoddessBasic value) {
                if (this.s2CGoddessesBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.add(index, value);
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addS2CGoddesses(GoddessHandler.GoddessBasic.Builder builderForValue) {
                if (this.s2CGoddessesBuilder_ == null) {
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addS2CGoddesses(int index, GoddessHandler.GoddessBasic.Builder builderForValue) {
                if (this.s2CGoddessesBuilder_ == null) {
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllS2CGoddesses(Iterable<? extends GoddessHandler.GoddessBasic> values) {
                if (this.s2CGoddessesBuilder_ == null) {
                    ensureS2CGoddessesIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.s2CGoddesses_);
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearS2CGoddesses() {
                if (this.s2CGoddessesBuilder_ == null) {
                    this.s2CGoddesses_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.clear();
                }
                return this;
            }

            public Builder removeS2CGoddesses(int index) {
                if (this.s2CGoddessesBuilder_ == null) {
                    ensureS2CGoddessesIsMutable();
                    this.s2CGoddesses_.remove(index);
                    onChanged();
                } else {
                    this.s2CGoddessesBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessBasic.Builder getS2CGoddessesBuilder(int index) {
                return (GoddessHandler.GoddessBasic.Builder) getS2CGoddessesFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessBasicOrBuilder getS2CGoddessesOrBuilder(int index) {
                if (this.s2CGoddessesBuilder_ == null) return this.s2CGoddesses_.get(index);
                return (GoddessHandler.GoddessBasicOrBuilder) this.s2CGoddessesBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessBasicOrBuilder> getS2CGoddessesOrBuilderList() {
                if (this.s2CGoddessesBuilder_ != null) return this.s2CGoddessesBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.s2CGoddesses_);
            }

            public GoddessHandler.GoddessBasic.Builder addS2CGoddessesBuilder() {
                return (GoddessHandler.GoddessBasic.Builder) getS2CGoddessesFieldBuilder().addBuilder(GoddessHandler.GoddessBasic.getDefaultInstance());
            }

            public GoddessHandler.GoddessBasic.Builder addS2CGoddessesBuilder(int index) {
                return (GoddessHandler.GoddessBasic.Builder) getS2CGoddessesFieldBuilder().addBuilder(index, GoddessHandler.GoddessBasic.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessBasic.Builder> getS2CGoddessesBuilderList() {
                return getS2CGoddessesFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessBasic, GoddessHandler.GoddessBasic.Builder, GoddessHandler.GoddessBasicOrBuilder> getS2CGoddessesFieldBuilder() {
                if (this.s2CGoddessesBuilder_ == null) {
                    this.s2CGoddessesBuilder_ = new RepeatedFieldBuilder(this.s2CGoddesses_, ((this.bitField0_ & 0x8) == 8), getParentForChildren(), isClean());
                    this.s2CGoddesses_ = null;
                }
                return this.s2CGoddessesBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessGift
            extends GeneratedMessage
            implements GoddessGiftOrBuilder {
        private static final GoddessGift defaultInstance = new GoddessGift(true);
        private final UnknownFieldSet unknownFields;

        private GoddessGift(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessGift(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessGift getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessGift getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessGift(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GoddessHandler.GoddessGiftBasic.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.id_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.price_ = input.readInt32();
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.name_ = bs;
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.pic_ = bs;
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.des_ = bs;
                            break;
                        case 50:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x20) == 32) subBuilder = this.basic_.toBuilder();
                            this.basic_ = (GoddessHandler.GoddessGiftBasic) input.readMessage(GoddessHandler.GoddessGiftBasic.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.basic_);
                                this.basic_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x20;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGift_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGift_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessGift.class, Builder.class);
        }

        public static Parser<GoddessGift> PARSER = (Parser<GoddessGift>) new AbstractParser<GoddessGift>() {
            public GoddessHandler.GoddessGift parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessGift(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        public static final int PRICE_FIELD_NUMBER = 2;
        private int price_;
        public static final int NAME_FIELD_NUMBER = 3;
        private Object name_;
        public static final int PIC_FIELD_NUMBER = 4;
        private Object pic_;
        public static final int DES_FIELD_NUMBER = 5;
        private Object des_;
        public static final int BASIC_FIELD_NUMBER = 6;
        private GoddessHandler.GoddessGiftBasic basic_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessGift> getParserForType() {
            return PARSER;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getId() {
            return this.id_;
        }

        public boolean hasPrice() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getPrice() {
            return this.price_;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        static {
            defaultInstance.initFields();
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasPic() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public String getPic() {
            Object ref = this.pic_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.pic_ = s;
            return s;
        }

        public ByteString getPicBytes() {
            Object ref = this.pic_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.pic_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasDes() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getDes() {
            Object ref = this.des_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.des_ = s;
            return s;
        }

        public ByteString getDesBytes() {
            Object ref = this.des_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.des_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasBasic() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public GoddessHandler.GoddessGiftBasic getBasic() {
            return this.basic_;
        }

        public GoddessHandler.GoddessGiftBasicOrBuilder getBasicOrBuilder() {
            return this.basic_;
        }

        private void initFields() {
            this.id_ = 0;
            this.price_ = 0;
            this.name_ = "";
            this.pic_ = "";
            this.des_ = "";
            this.basic_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPrice()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPic()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDes()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasBasic()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!getBasic().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeInt32(1, this.id_);
            if ((this.bitField0_ & 0x2) == 2)
                output.writeInt32(2, this.price_);
            if ((this.bitField0_ & 0x4) == 4)
                output.writeBytes(3, getNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                output.writeBytes(4, getPicBytes());
            if ((this.bitField0_ & 0x10) == 16)
                output.writeBytes(5, getDesBytes());
            if ((this.bitField0_ & 0x20) == 32)
                output.writeMessage(6, (MessageLite) this.basic_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeInt32Size(1, this.id_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeInt32Size(2, this.price_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeBytesSize(3, getNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeBytesSize(4, getPicBytes());
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeBytesSize(5, getDesBytes());
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.basic_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessGift parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessGift) PARSER.parseFrom(data);
        }

        public static GoddessGift parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGift) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGift parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessGift) PARSER.parseFrom(data);
        }

        public static GoddessGift parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGift) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGift parseFrom(InputStream input) throws IOException {
            return (GoddessGift) PARSER.parseFrom(input);
        }

        public static GoddessGift parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGift) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessGift parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessGift) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessGift parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGift) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessGift parseFrom(CodedInputStream input) throws IOException {
            return (GoddessGift) PARSER.parseFrom(input);
        }

        public static GoddessGift parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGift) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessGift prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessGiftOrBuilder {
            private int bitField0_;
            private int id_;
            private int price_;
            private Object name_;
            private Object pic_;
            private Object des_;
            private GoddessHandler.GoddessGiftBasic basic_;
            private SingleFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> basicBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGift_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGift_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessGift.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.pic_ = "";
                this.des_ = "";
                this.basic_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.pic_ = "";
                this.des_ = "";
                this.basic_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessGift.alwaysUseFieldBuilders)
                    getBasicFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.price_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.pic_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                this.des_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                if (this.basicBuilder_ == null) {
                    this.basic_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance();
                } else {
                    this.basicBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGift_descriptor;
            }

            public GoddessHandler.GoddessGift getDefaultInstanceForType() {
                return GoddessHandler.GoddessGift.getDefaultInstance();
            }

            public GoddessHandler.GoddessGift build() {
                GoddessHandler.GoddessGift result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessGift buildPartial() {
                GoddessHandler.GoddessGift result = new GoddessHandler.GoddessGift(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.price_ = this.price_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.pic_ = this.pic_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.des_ = this.des_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                if (this.basicBuilder_ == null) {
                    result.basic_ = this.basic_;
                } else {
                    result.basic_ = (GoddessHandler.GoddessGiftBasic) this.basicBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessGift)
                    return mergeFrom((GoddessHandler.GoddessGift) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessGift other) {
                if (other == GoddessHandler.GoddessGift.getDefaultInstance())
                    return this;
                if (other.hasId())
                    setId(other.getId());
                if (other.hasPrice())
                    setPrice(other.getPrice());
                if (other.hasName()) {
                    this.bitField0_ |= 0x4;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasPic()) {
                    this.bitField0_ |= 0x8;
                    this.pic_ = other.pic_;
                    onChanged();
                }
                if (other.hasDes()) {
                    this.bitField0_ |= 0x10;
                    this.des_ = other.des_;
                    onChanged();
                }
                if (other.hasBasic())
                    mergeBasic(other.getBasic());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId())
                    return false;
                if (!hasPrice())
                    return false;
                if (!hasName())
                    return false;
                if (!hasPic())
                    return false;
                if (!hasDes())
                    return false;
                if (!hasBasic())
                    return false;
                if (!getBasic().isInitialized())
                    return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessGift parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessGift) GoddessHandler.GoddessGift.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessGift) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getId() {
                return this.id_;
            }

            public Builder setId(int value) {
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public boolean hasPrice() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getPrice() {
                return this.price_;
            }

            public Builder setPrice(int value) {
                this.bitField0_ |= 0x2;
                this.price_ = value;
                onChanged();
                return this;
            }

            public Builder clearPrice() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.price_ = 0;
                onChanged();
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.name_ = GoddessHandler.GoddessGift.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasPic() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public String getPic() {
                Object ref = this.pic_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.pic_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getPicBytes() {
                Object ref = this.pic_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.pic_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setPic(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.pic_ = value;
                onChanged();
                return this;
            }

            public Builder clearPic() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.pic_ = GoddessHandler.GoddessGift.getDefaultInstance().getPic();
                onChanged();
                return this;
            }

            public Builder setPicBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.pic_ = value;
                onChanged();
                return this;
            }

            public boolean hasDes() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getDes() {
                Object ref = this.des_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.des_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDesBytes() {
                Object ref = this.des_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.des_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDes(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.des_ = value;
                onChanged();
                return this;
            }

            public Builder clearDes() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.des_ = GoddessHandler.GoddessGift.getDefaultInstance().getDes();
                onChanged();
                return this;
            }

            public Builder setDesBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.des_ = value;
                onChanged();
                return this;
            }

            public boolean hasBasic() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public GoddessHandler.GoddessGiftBasic getBasic() {
                if (this.basicBuilder_ == null)
                    return this.basic_;
                return (GoddessHandler.GoddessGiftBasic) this.basicBuilder_.getMessage();
            }

            public Builder setBasic(GoddessHandler.GoddessGiftBasic value) {
                if (this.basicBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    this.basic_ = value;
                    onChanged();
                } else {
                    this.basicBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x20;
                return this;
            }

            public Builder setBasic(GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.basicBuilder_ == null) {
                    this.basic_ = builderForValue.build();
                    onChanged();
                } else {
                    this.basicBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x20;
                return this;
            }

            public Builder mergeBasic(GoddessHandler.GoddessGiftBasic value) {
                if (this.basicBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) == 32 && this.basic_ != GoddessHandler.GoddessGiftBasic.getDefaultInstance()) {
                        this.basic_ = GoddessHandler.GoddessGiftBasic.newBuilder(this.basic_).mergeFrom(value).buildPartial();
                    } else {
                        this.basic_ = value;
                    }
                    onChanged();
                } else {
                    this.basicBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x20;
                return this;
            }

            public Builder clearBasic() {
                if (this.basicBuilder_ == null) {
                    this.basic_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance();
                    onChanged();
                } else {
                    this.basicBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }

            public GoddessHandler.GoddessGiftBasic.Builder getBasicBuilder() {
                this.bitField0_ |= 0x20;
                onChanged();
                return (GoddessHandler.GoddessGiftBasic.Builder) getBasicFieldBuilder().getBuilder();
            }

            public GoddessHandler.GoddessGiftBasicOrBuilder getBasicOrBuilder() {
                if (this.basicBuilder_ != null)
                    return (GoddessHandler.GoddessGiftBasicOrBuilder) this.basicBuilder_.getMessageOrBuilder();
                return this.basic_;
            }

            private SingleFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> getBasicFieldBuilder() {
                if (this.basicBuilder_ == null) {
                    this.basicBuilder_ = new SingleFieldBuilder(getBasic(), getParentForChildren(), isClean());
                    this.basic_ = null;
                }
                return this.basicBuilder_;
            }
        }
    }

    public static final class GoddessGiftBasic extends GeneratedMessage implements GoddessGiftBasicOrBuilder {
        private static final GoddessGiftBasic defaultInstance = new GoddessGiftBasic(true);
        private final UnknownFieldSet unknownFields;

        private GoddessGiftBasic(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessGiftBasic(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessGiftBasic getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessGiftBasic getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessGiftBasic(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.pos_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.show_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.state_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGiftBasic_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGiftBasic_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessGiftBasic.class, Builder.class);
        }

        public static Parser<GoddessGiftBasic> PARSER = (Parser<GoddessGiftBasic>) new AbstractParser<GoddessGiftBasic>() {
            public GoddessHandler.GoddessGiftBasic parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessGiftBasic(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int POS_FIELD_NUMBER = 1;
        private int pos_;
        public static final int SHOW_FIELD_NUMBER = 2;
        private Object show_;
        public static final int STATE_FIELD_NUMBER = 3;
        private int state_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessGiftBasic> getParserForType() {
            return PARSER;
        }

        public boolean hasPos() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getPos() {
            return this.pos_;
        }

        public boolean hasShow() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getShow() {
            Object ref = this.show_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.show_ = s;
            return s;
        }

        public ByteString getShowBytes() {
            Object ref = this.show_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.show_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasState() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getState() {
            return this.state_;
        }

        private void initFields() {
            this.pos_ = 0;
            this.show_ = "";
            this.state_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasPos()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasShow()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasState()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getShowBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.state_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.pos_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getShowBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.state_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessGiftBasic parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessGiftBasic) PARSER.parseFrom(data);
        }

        public static GoddessGiftBasic parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGiftBasic) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGiftBasic parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessGiftBasic) PARSER.parseFrom(data);
        }

        public static GoddessGiftBasic parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGiftBasic) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGiftBasic parseFrom(InputStream input) throws IOException {
            return (GoddessGiftBasic) PARSER.parseFrom(input);
        }

        public static GoddessGiftBasic parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftBasic) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessGiftBasic parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessGiftBasic) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessGiftBasic parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftBasic) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessGiftBasic parseFrom(CodedInputStream input) throws IOException {
            return (GoddessGiftBasic) PARSER.parseFrom(input);
        }

        public static GoddessGiftBasic parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftBasic) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessGiftBasic prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessGiftBasicOrBuilder {
            private int bitField0_;
            private int pos_;
            private Object show_;
            private int state_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftBasic_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftBasic_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessGiftBasic.class, Builder.class);
            }

            private Builder() {
                this.show_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.show_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessGiftBasic.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.pos_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.show_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.state_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftBasic_descriptor;
            }

            public GoddessHandler.GoddessGiftBasic getDefaultInstanceForType() {
                return GoddessHandler.GoddessGiftBasic.getDefaultInstance();
            }

            public GoddessHandler.GoddessGiftBasic build() {
                GoddessHandler.GoddessGiftBasic result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessGiftBasic buildPartial() {
                GoddessHandler.GoddessGiftBasic result = new GoddessHandler.GoddessGiftBasic(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.pos_ = this.pos_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.show_ = this.show_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.state_ = this.state_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessGiftBasic)
                    return mergeFrom((GoddessHandler.GoddessGiftBasic) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessGiftBasic other) {
                if (other == GoddessHandler.GoddessGiftBasic.getDefaultInstance()) return this;
                if (other.hasPos()) setPos(other.getPos());
                if (other.hasShow()) {
                    this.bitField0_ |= 0x2;
                    this.show_ = other.show_;
                    onChanged();
                }
                if (other.hasState()) setState(other.getState());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasPos()) return false;
                if (!hasShow()) return false;
                if (!hasState()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessGiftBasic parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessGiftBasic) GoddessHandler.GoddessGiftBasic.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessGiftBasic) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasPos() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getPos() {
                return this.pos_;
            }

            public Builder setPos(int value) {
                this.bitField0_ |= 0x1;
                this.pos_ = value;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public boolean hasShow() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getShow() {
                Object ref = this.show_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.show_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getShowBytes() {
                Object ref = this.show_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.show_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setShow(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.show_ = value;
                onChanged();
                return this;
            }

            public Builder clearShow() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.show_ = GoddessHandler.GoddessGiftBasic.getDefaultInstance().getShow();
                onChanged();
                return this;
            }

            public Builder setShowBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.show_ = value;
                onChanged();
                return this;
            }

            public boolean hasState() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getState() {
                return this.state_;
            }

            public Builder setState(int value) {
                this.bitField0_ |= 0x4;
                this.state_ = value;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.state_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }


    public static final class GoddessSkill
            extends GeneratedMessage
            implements GoddessSkillOrBuilder {
        private final UnknownFieldSet unknownFields;


        private GoddessSkill(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }


        private GoddessSkill(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }


        public static GoddessSkill getDefaultInstance() {
            return defaultInstance;
        }


        public GoddessSkill getDefaultInstanceForType() {
            return defaultInstance;
        }


        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }


        private GoddessSkill(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.name_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.pic_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.des_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.level_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }


        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessSkill_descriptor;
        }


        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessSkill_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessSkill.class, Builder.class);
        }


        public static Parser<GoddessSkill> PARSER = (Parser<GoddessSkill>) new AbstractParser<GoddessSkill>() {
            public GoddessHandler.GoddessSkill parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessSkill(input, extensionRegistry);
            }
        };


        private int bitField0_;


        public static final int NAME_FIELD_NUMBER = 1;


        private Object name_;


        public static final int PIC_FIELD_NUMBER = 2;


        private Object pic_;


        public static final int DES_FIELD_NUMBER = 3;


        private Object des_;


        public static final int LEVEL_FIELD_NUMBER = 4;


        private int level_;


        private byte memoizedIsInitialized;


        private int memoizedSerializedSize;


        private static final long serialVersionUID = 0L;


        public Parser<GoddessSkill> getParserForType() {
            return PARSER;
        }


        public boolean hasName() {
            return ((this.bitField0_ & 0x1) == 1);
        }


        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.name_ = s;
            }
            return s;
        }


        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasPic() {
            return ((this.bitField0_ & 0x2) == 2);
        }


        public String getPic() {
            Object ref = this.pic_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.pic_ = s;
            }
            return s;
        }


        public ByteString getPicBytes() {
            Object ref = this.pic_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.pic_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasDes() {
            return ((this.bitField0_ & 0x4) == 4);
        }


        public String getDes() {
            Object ref = this.des_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.des_ = s;
            }
            return s;
        }


        public ByteString getDesBytes() {
            Object ref = this.des_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.des_ = b;
                return b;
            }
            return (ByteString) ref;
        }


        public boolean hasLevel() {
            return ((this.bitField0_ & 0x8) == 8);
        }


        public int getLevel() {
            return this.level_;
        }


        private void initFields() {
            this.name_ = "";
            this.pic_ = "";
            this.des_ = "";
            this.level_ = 0;
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPic()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDes()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasLevel()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeBytes(1, getNameBytes());
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeBytes(2, getPicBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                output.writeBytes(3, getDesBytes());
            }
            if ((this.bitField0_ & 0x8) == 8) {
                output.writeInt32(4, this.level_);
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeBytesSize(1, getNameBytes());
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeBytesSize(2, getPicBytes());
            }
            if ((this.bitField0_ & 0x4) == 4) {
                size += CodedOutputStream.computeBytesSize(3, getDesBytes());
            }
            if ((this.bitField0_ & 0x8) == 8) {
                size += CodedOutputStream.computeInt32Size(4, this.level_);
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GoddessSkill parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessSkill) PARSER.parseFrom(data);
        }


        public static GoddessSkill parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessSkill) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessSkill parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessSkill) PARSER.parseFrom(data);
        }


        private static final GoddessSkill defaultInstance = new GoddessSkill(true);

        public static GoddessSkill parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessSkill) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessSkill parseFrom(InputStream input) throws IOException {
            return (GoddessSkill) PARSER.parseFrom(input);
        }

        public static GoddessSkill parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessSkill) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessSkill parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessSkill) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessSkill parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessSkill) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessSkill parseFrom(CodedInputStream input) throws IOException {
            return (GoddessSkill) PARSER.parseFrom(input);
        }

        public static GoddessSkill parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessSkill) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessSkill prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessSkillOrBuilder {
            private int bitField0_;
            private Object name_;
            private Object pic_;
            private Object des_;
            private int level_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessSkill_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessSkill_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessSkill.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.pic_ = "";
                this.des_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.pic_ = "";
                this.des_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessSkill.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.pic_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.des_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.level_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessSkill_descriptor;
            }

            public GoddessHandler.GoddessSkill getDefaultInstanceForType() {
                return GoddessHandler.GoddessSkill.getDefaultInstance();
            }

            public GoddessHandler.GoddessSkill build() {
                GoddessHandler.GoddessSkill result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessSkill buildPartial() {
                GoddessHandler.GoddessSkill result = new GoddessHandler.GoddessSkill(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.pic_ = this.pic_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.des_ = this.des_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.level_ = this.level_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessSkill) return mergeFrom((GoddessHandler.GoddessSkill) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessSkill other) {
                if (other == GoddessHandler.GoddessSkill.getDefaultInstance()) return this;
                if (other.hasName()) {
                    this.bitField0_ |= 0x1;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasPic()) {
                    this.bitField0_ |= 0x2;
                    this.pic_ = other.pic_;
                    onChanged();
                }
                if (other.hasDes()) {
                    this.bitField0_ |= 0x4;
                    this.des_ = other.des_;
                    onChanged();
                }
                if (other.hasLevel()) setLevel(other.getLevel());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) return false;
                if (!hasPic()) return false;
                if (!hasDes()) return false;
                if (!hasLevel()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessSkill parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessSkill) GoddessHandler.GoddessSkill.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessSkill) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.name_ = GoddessHandler.GoddessSkill.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasPic() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getPic() {
                Object ref = this.pic_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.pic_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getPicBytes() {
                Object ref = this.pic_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.pic_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setPic(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.pic_ = value;
                onChanged();
                return this;
            }

            public Builder clearPic() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.pic_ = GoddessHandler.GoddessSkill.getDefaultInstance().getPic();
                onChanged();
                return this;
            }

            public Builder setPicBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.pic_ = value;
                onChanged();
                return this;
            }

            public boolean hasDes() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getDes() {
                Object ref = this.des_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.des_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDesBytes() {
                Object ref = this.des_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.des_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDes(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.des_ = value;
                onChanged();
                return this;
            }

            public Builder clearDes() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.des_ = GoddessHandler.GoddessSkill.getDefaultInstance().getDes();
                onChanged();
                return this;
            }

            public Builder setDesBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.des_ = value;
                onChanged();
                return this;
            }

            public boolean hasLevel() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getLevel() {
                return this.level_;
            }

            public Builder setLevel(int value) {
                this.bitField0_ |= 0x8;
                this.level_ = value;
                onChanged();
                return this;
            }

            public Builder clearLevel() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.level_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessBasic
            extends GeneratedMessage
            implements GoddessBasicOrBuilder {
        private static final GoddessBasic defaultInstance = new GoddessBasic(true);
        private final UnknownFieldSet unknownFields;

        private GoddessBasic(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessBasic(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessBasic getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessBasic getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessBasic(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.id_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.templateId_ = input.readInt32();
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.name_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.state_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.star_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.intimacy_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.intimacyLevel_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.intimacyStage_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.actionCount_ = input.readInt32();
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.upStarItemCur_ = input.readInt32();
                            break;
                        case 88:
                            this.bitField0_ |= 0x400;
                            this.upStarItemMax_ = input.readInt32();
                            break;
                        case 96:
                            this.bitField0_ |= 0x800;
                            this.needIntimacy_ = input.readInt32();
                            break;
                        case 106:
                            if ((mutable_bitField0_ & 0x1000) != 4096) {
                                this.equips_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x1000;
                            }
                            this.equips_.add(input.readMessage(GoddessHandler.GoddessGiftBasic.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x1000) == 4096) this.equips_ = Collections.unmodifiableList(this.equips_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessBasic_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessBasic_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessBasic.class, Builder.class);
        }

        public static Parser<GoddessBasic> PARSER = (Parser<GoddessBasic>) new AbstractParser<GoddessBasic>() {
            public GoddessHandler.GoddessBasic parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessBasic(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        public static final int TEMPLATEID_FIELD_NUMBER = 2;
        private int templateId_;
        public static final int NAME_FIELD_NUMBER = 3;
        private Object name_;
        public static final int STATE_FIELD_NUMBER = 4;
        private int state_;
        public static final int STAR_FIELD_NUMBER = 5;
        private int star_;
        public static final int INTIMACY_FIELD_NUMBER = 6;
        private int intimacy_;
        public static final int INTIMACYLEVEL_FIELD_NUMBER = 7;
        private int intimacyLevel_;
        public static final int INTIMACYSTAGE_FIELD_NUMBER = 8;
        private int intimacyStage_;
        public static final int ACTIONCOUNT_FIELD_NUMBER = 9;
        private int actionCount_;
        public static final int UPSTARITEMCUR_FIELD_NUMBER = 10;
        private int upStarItemCur_;
        public static final int UPSTARITEMMAX_FIELD_NUMBER = 11;
        private int upStarItemMax_;
        public static final int NEEDINTIMACY_FIELD_NUMBER = 12;
        private int needIntimacy_;
        public static final int EQUIPS_FIELD_NUMBER = 13;
        private List<GoddessHandler.GoddessGiftBasic> equips_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessBasic> getParserForType() {
            return PARSER;
        }

        public boolean hasId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getId() {
            return this.id_;
        }

        public boolean hasTemplateId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getTemplateId() {
            return this.templateId_;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasState() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getState() {
            return this.state_;
        }

        public boolean hasStar() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getStar() {
            return this.star_;
        }

        public boolean hasIntimacy() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getIntimacy() {
            return this.intimacy_;
        }

        public boolean hasIntimacyLevel() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getIntimacyLevel() {
            return this.intimacyLevel_;
        }

        public boolean hasIntimacyStage() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getIntimacyStage() {
            return this.intimacyStage_;
        }

        public boolean hasActionCount() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getActionCount() {
            return this.actionCount_;
        }

        public boolean hasUpStarItemCur() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getUpStarItemCur() {
            return this.upStarItemCur_;
        }

        public boolean hasUpStarItemMax() {
            return ((this.bitField0_ & 0x400) == 1024);
        }

        public int getUpStarItemMax() {
            return this.upStarItemMax_;
        }

        public boolean hasNeedIntimacy() {
            return ((this.bitField0_ & 0x800) == 2048);
        }

        public int getNeedIntimacy() {
            return this.needIntimacy_;
        }

        public List<GoddessHandler.GoddessGiftBasic> getEquipsList() {
            return this.equips_;
        }

        public List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getEquipsOrBuilderList() {
            return (List) this.equips_;
        }

        public int getEquipsCount() {
            return this.equips_.size();
        }

        static {
            defaultInstance.initFields();
        }

        public GoddessHandler.GoddessGiftBasic getEquips(int index) {
            return this.equips_.get(index);
        }

        public GoddessHandler.GoddessGiftBasicOrBuilder getEquipsOrBuilder(int index) {
            return this.equips_.get(index);
        }

        private void initFields() {
            this.id_ = 0;
            this.templateId_ = 0;
            this.name_ = "";
            this.state_ = 0;
            this.star_ = 0;
            this.intimacy_ = 0;
            this.intimacyLevel_ = 0;
            this.intimacyStage_ = 0;
            this.actionCount_ = 0;
            this.upStarItemCur_ = 0;
            this.upStarItemMax_ = 0;
            this.needIntimacy_ = 0;
            this.equips_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTemplateId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasState()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasStar()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIntimacy()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIntimacyLevel()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasIntimacyStage()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasActionCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasUpStarItemCur()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasUpStarItemMax()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasNeedIntimacy()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getEquipsCount(); i++) {
                if (!getEquips(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeInt32(1, this.id_);
            if ((this.bitField0_ & 0x2) == 2)
                output.writeInt32(2, this.templateId_);
            if ((this.bitField0_ & 0x4) == 4)
                output.writeBytes(3, getNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(4, this.state_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeInt32(5, this.star_);
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(6, this.intimacy_);
            if ((this.bitField0_ & 0x40) == 64)
                output.writeInt32(7, this.intimacyLevel_);
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(8, this.intimacyStage_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(9, this.actionCount_);
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt32(10, this.upStarItemCur_);
            if ((this.bitField0_ & 0x400) == 1024)
                output.writeInt32(11, this.upStarItemMax_);
            if ((this.bitField0_ & 0x800) == 2048)
                output.writeInt32(12, this.needIntimacy_);
            for (int i = 0; i < this.equips_.size(); i++)
                output.writeMessage(13, (MessageLite) this.equips_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeInt32Size(1, this.id_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeInt32Size(2, this.templateId_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeBytesSize(3, getNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(4, this.state_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeInt32Size(5, this.star_);
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(6, this.intimacy_);
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.intimacyLevel_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(8, this.intimacyStage_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(9, this.actionCount_);
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt32Size(10, this.upStarItemCur_);
            if ((this.bitField0_ & 0x400) == 1024)
                size += CodedOutputStream.computeInt32Size(11, this.upStarItemMax_);
            if ((this.bitField0_ & 0x800) == 2048)
                size += CodedOutputStream.computeInt32Size(12, this.needIntimacy_);
            for (int i = 0; i < this.equips_.size(); i++)
                size += CodedOutputStream.computeMessageSize(13, (MessageLite) this.equips_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessBasic parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessBasic) PARSER.parseFrom(data);
        }

        public static GoddessBasic parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessBasic) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessBasic parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessBasic) PARSER.parseFrom(data);
        }

        public static GoddessBasic parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessBasic) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessBasic parseFrom(InputStream input) throws IOException {
            return (GoddessBasic) PARSER.parseFrom(input);
        }

        public static GoddessBasic parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessBasic) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessBasic parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessBasic) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessBasic parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessBasic) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessBasic parseFrom(CodedInputStream input) throws IOException {
            return (GoddessBasic) PARSER.parseFrom(input);
        }

        public static GoddessBasic parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessBasic) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessBasic prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessBasicOrBuilder {
            private int bitField0_;
            private int id_;
            private int templateId_;
            private Object name_;
            private int state_;
            private int star_;
            private int intimacy_;
            private int intimacyLevel_;
            private int intimacyStage_;
            private int actionCount_;
            private int upStarItemCur_;
            private int upStarItemMax_;
            private int needIntimacy_;
            private List<GoddessHandler.GoddessGiftBasic> equips_;
            private RepeatedFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> equipsBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessBasic_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessBasic_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessBasic.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.equips_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.equips_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessBasic.alwaysUseFieldBuilders)
                    getEquipsFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.id_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.templateId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.state_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.star_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.intimacy_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.intimacyLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.intimacyStage_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.actionCount_ = 0;
                this.bitField0_ &= 0xFFFFFEFF;
                this.upStarItemCur_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                this.upStarItemMax_ = 0;
                this.bitField0_ &= 0xFFFFFBFF;
                this.needIntimacy_ = 0;
                this.bitField0_ &= 0xFFFFF7FF;
                if (this.equipsBuilder_ == null) {
                    this.equips_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFEFFF;
                } else {
                    this.equipsBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessBasic_descriptor;
            }

            public GoddessHandler.GoddessBasic getDefaultInstanceForType() {
                return GoddessHandler.GoddessBasic.getDefaultInstance();
            }

            public GoddessHandler.GoddessBasic build() {
                GoddessHandler.GoddessBasic result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessBasic buildPartial() {
                GoddessHandler.GoddessBasic result = new GoddessHandler.GoddessBasic(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.id_ = this.id_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.templateId_ = this.templateId_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.state_ = this.state_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.star_ = this.star_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.intimacy_ = this.intimacy_;
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x40;
                result.intimacyLevel_ = this.intimacyLevel_;
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x80;
                result.intimacyStage_ = this.intimacyStage_;
                if ((from_bitField0_ & 0x100) == 256)
                    to_bitField0_ |= 0x100;
                result.actionCount_ = this.actionCount_;
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x200;
                result.upStarItemCur_ = this.upStarItemCur_;
                if ((from_bitField0_ & 0x400) == 1024)
                    to_bitField0_ |= 0x400;
                result.upStarItemMax_ = this.upStarItemMax_;
                if ((from_bitField0_ & 0x800) == 2048)
                    to_bitField0_ |= 0x800;
                result.needIntimacy_ = this.needIntimacy_;
                if (this.equipsBuilder_ == null) {
                    if ((this.bitField0_ & 0x1000) == 4096) {
                        this.equips_ = Collections.unmodifiableList(this.equips_);
                        this.bitField0_ &= 0xFFFFEFFF;
                    }
                    result.equips_ = this.equips_;
                } else {
                    result.equips_ = this.equipsBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessBasic)
                    return mergeFrom((GoddessHandler.GoddessBasic) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessBasic other) {
                if (other == GoddessHandler.GoddessBasic.getDefaultInstance())
                    return this;
                if (other.hasId())
                    setId(other.getId());
                if (other.hasTemplateId())
                    setTemplateId(other.getTemplateId());
                if (other.hasName()) {
                    this.bitField0_ |= 0x4;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasState())
                    setState(other.getState());
                if (other.hasStar())
                    setStar(other.getStar());
                if (other.hasIntimacy())
                    setIntimacy(other.getIntimacy());
                if (other.hasIntimacyLevel())
                    setIntimacyLevel(other.getIntimacyLevel());
                if (other.hasIntimacyStage())
                    setIntimacyStage(other.getIntimacyStage());
                if (other.hasActionCount())
                    setActionCount(other.getActionCount());
                if (other.hasUpStarItemCur())
                    setUpStarItemCur(other.getUpStarItemCur());
                if (other.hasUpStarItemMax())
                    setUpStarItemMax(other.getUpStarItemMax());
                if (other.hasNeedIntimacy())
                    setNeedIntimacy(other.getNeedIntimacy());
                if (this.equipsBuilder_ == null) {
                    if (!other.equips_.isEmpty()) {
                        if (this.equips_.isEmpty()) {
                            this.equips_ = other.equips_;
                            this.bitField0_ &= 0xFFFFEFFF;
                        } else {
                            ensureEquipsIsMutable();
                            this.equips_.addAll(other.equips_);
                        }
                        onChanged();
                    }
                } else if (!other.equips_.isEmpty()) {
                    if (this.equipsBuilder_.isEmpty()) {
                        this.equipsBuilder_.dispose();
                        this.equipsBuilder_ = null;
                        this.equips_ = other.equips_;
                        this.bitField0_ &= 0xFFFFEFFF;
                        this.equipsBuilder_ = GoddessHandler.GoddessBasic.alwaysUseFieldBuilders ? getEquipsFieldBuilder() : null;
                    } else {
                        this.equipsBuilder_.addAllMessages(other.equips_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId())
                    return false;
                if (!hasTemplateId())
                    return false;
                if (!hasName())
                    return false;
                if (!hasState())
                    return false;
                if (!hasStar())
                    return false;
                if (!hasIntimacy())
                    return false;
                if (!hasIntimacyLevel())
                    return false;
                if (!hasIntimacyStage())
                    return false;
                if (!hasActionCount())
                    return false;
                if (!hasUpStarItemCur())
                    return false;
                if (!hasUpStarItemMax())
                    return false;
                if (!hasNeedIntimacy())
                    return false;
                for (int i = 0; i < getEquipsCount(); i++) {
                    if (!getEquips(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessBasic parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessBasic) GoddessHandler.GoddessBasic.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessBasic) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getId() {
                return this.id_;
            }

            public Builder setId(int value) {
                this.bitField0_ |= 0x1;
                this.id_ = value;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTemplateId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getTemplateId() {
                return this.templateId_;
            }

            public Builder setTemplateId(int value) {
                this.bitField0_ |= 0x2;
                this.templateId_ = value;
                onChanged();
                return this;
            }

            public Builder clearTemplateId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.templateId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.name_ = GoddessHandler.GoddessBasic.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasState() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getState() {
                return this.state_;
            }

            public Builder setState(int value) {
                this.bitField0_ |= 0x8;
                this.state_ = value;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public boolean hasStar() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getStar() {
                return this.star_;
            }

            public Builder setStar(int value) {
                this.bitField0_ |= 0x10;
                this.star_ = value;
                onChanged();
                return this;
            }

            public Builder clearStar() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.star_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIntimacy() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getIntimacy() {
                return this.intimacy_;
            }

            public Builder setIntimacy(int value) {
                this.bitField0_ |= 0x20;
                this.intimacy_ = value;
                onChanged();
                return this;
            }

            public Builder clearIntimacy() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.intimacy_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIntimacyLevel() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getIntimacyLevel() {
                return this.intimacyLevel_;
            }

            public Builder setIntimacyLevel(int value) {
                this.bitField0_ |= 0x40;
                this.intimacyLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearIntimacyLevel() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.intimacyLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIntimacyStage() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getIntimacyStage() {
                return this.intimacyStage_;
            }

            public Builder setIntimacyStage(int value) {
                this.bitField0_ |= 0x80;
                this.intimacyStage_ = value;
                onChanged();
                return this;
            }

            public Builder clearIntimacyStage() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.intimacyStage_ = 0;
                onChanged();
                return this;
            }

            public boolean hasActionCount() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public int getActionCount() {
                return this.actionCount_;
            }

            public Builder setActionCount(int value) {
                this.bitField0_ |= 0x100;
                this.actionCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearActionCount() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.actionCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasUpStarItemCur() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getUpStarItemCur() {
                return this.upStarItemCur_;
            }

            public Builder setUpStarItemCur(int value) {
                this.bitField0_ |= 0x200;
                this.upStarItemCur_ = value;
                onChanged();
                return this;
            }

            public Builder clearUpStarItemCur() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.upStarItemCur_ = 0;
                onChanged();
                return this;
            }

            public boolean hasUpStarItemMax() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public int getUpStarItemMax() {
                return this.upStarItemMax_;
            }

            public Builder setUpStarItemMax(int value) {
                this.bitField0_ |= 0x400;
                this.upStarItemMax_ = value;
                onChanged();
                return this;
            }

            public Builder clearUpStarItemMax() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.upStarItemMax_ = 0;
                onChanged();
                return this;
            }

            public boolean hasNeedIntimacy() {
                return ((this.bitField0_ & 0x800) == 2048);
            }

            public int getNeedIntimacy() {
                return this.needIntimacy_;
            }

            public Builder setNeedIntimacy(int value) {
                this.bitField0_ |= 0x800;
                this.needIntimacy_ = value;
                onChanged();
                return this;
            }

            public Builder clearNeedIntimacy() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.needIntimacy_ = 0;
                onChanged();
                return this;
            }

            private void ensureEquipsIsMutable() {
                if ((this.bitField0_ & 0x1000) != 4096) {
                    this.equips_ = new ArrayList<>(this.equips_);
                    this.bitField0_ |= 0x1000;
                }
            }

            public List<GoddessHandler.GoddessGiftBasic> getEquipsList() {
                if (this.equipsBuilder_ == null)
                    return Collections.unmodifiableList(this.equips_);
                return this.equipsBuilder_.getMessageList();
            }

            public int getEquipsCount() {
                if (this.equipsBuilder_ == null)
                    return this.equips_.size();
                return this.equipsBuilder_.getCount();
            }

            public GoddessHandler.GoddessGiftBasic getEquips(int index) {
                if (this.equipsBuilder_ == null)
                    return this.equips_.get(index);
                return (GoddessHandler.GoddessGiftBasic) this.equipsBuilder_.getMessage(index);
            }

            public Builder setEquips(int index, GoddessHandler.GoddessGiftBasic value) {
                if (this.equipsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureEquipsIsMutable();
                    this.equips_.set(index, value);
                    onChanged();
                } else {
                    this.equipsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setEquips(int index, GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.equipsBuilder_ == null) {
                    ensureEquipsIsMutable();
                    this.equips_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.equipsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addEquips(GoddessHandler.GoddessGiftBasic value) {
                if (this.equipsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureEquipsIsMutable();
                    this.equips_.add(value);
                    onChanged();
                } else {
                    this.equipsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addEquips(int index, GoddessHandler.GoddessGiftBasic value) {
                if (this.equipsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureEquipsIsMutable();
                    this.equips_.add(index, value);
                    onChanged();
                } else {
                    this.equipsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addEquips(GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.equipsBuilder_ == null) {
                    ensureEquipsIsMutable();
                    this.equips_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.equipsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addEquips(int index, GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.equipsBuilder_ == null) {
                    ensureEquipsIsMutable();
                    this.equips_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.equipsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllEquips(Iterable<? extends GoddessHandler.GoddessGiftBasic> values) {
                if (this.equipsBuilder_ == null) {
                    ensureEquipsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.equips_);
                    onChanged();
                } else {
                    this.equipsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearEquips() {
                if (this.equipsBuilder_ == null) {
                    this.equips_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFEFFF;
                    onChanged();
                } else {
                    this.equipsBuilder_.clear();
                }
                return this;
            }

            public Builder removeEquips(int index) {
                if (this.equipsBuilder_ == null) {
                    ensureEquipsIsMutable();
                    this.equips_.remove(index);
                    onChanged();
                } else {
                    this.equipsBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessGiftBasic.Builder getEquipsBuilder(int index) {
                return (GoddessHandler.GoddessGiftBasic.Builder) getEquipsFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessGiftBasicOrBuilder getEquipsOrBuilder(int index) {
                if (this.equipsBuilder_ == null)
                    return this.equips_.get(index);
                return (GoddessHandler.GoddessGiftBasicOrBuilder) this.equipsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getEquipsOrBuilderList() {
                if (this.equipsBuilder_ != null)
                    return this.equipsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.equips_);
            }

            public GoddessHandler.GoddessGiftBasic.Builder addEquipsBuilder() {
                return (GoddessHandler.GoddessGiftBasic.Builder) getEquipsFieldBuilder().addBuilder(GoddessHandler.GoddessGiftBasic.getDefaultInstance());
            }

            public GoddessHandler.GoddessGiftBasic.Builder addEquipsBuilder(int index) {
                return (GoddessHandler.GoddessGiftBasic.Builder) getEquipsFieldBuilder().addBuilder(index, GoddessHandler.GoddessGiftBasic.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessGiftBasic.Builder> getEquipsBuilderList() {
                return getEquipsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> getEquipsFieldBuilder() {
                if (this.equipsBuilder_ == null) {
                    this.equipsBuilder_ = new RepeatedFieldBuilder(this.equips_, ((this.bitField0_ & 0x1000) == 4096), getParentForChildren(), isClean());
                    this.equips_ = null;
                }
                return this.equipsBuilder_;
            }
        }
    }

    public static final class GoddessEffectStruct extends GeneratedMessage implements GoddessEffectStructOrBuilder {
        private static final GoddessEffectStruct defaultInstance = new GoddessEffectStruct(true);
        private final UnknownFieldSet unknownFields;

        private GoddessEffectStruct(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessEffectStruct(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessEffectStruct getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessEffectStruct getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessEffectStruct(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.name_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.value_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessEffectStruct_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessEffectStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessEffectStruct.class, Builder.class);
        }

        public static Parser<GoddessEffectStruct> PARSER = (Parser<GoddessEffectStruct>) new AbstractParser<GoddessEffectStruct>() {
            public GoddessHandler.GoddessEffectStruct parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessEffectStruct(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private Object name_;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int value_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessEffectStruct> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasValue() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getValue() {
            return this.value_;
        }

        private void initFields() {
            this.name_ = "";
            this.value_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.value_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.value_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessEffectStruct parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessEffectStruct) PARSER.parseFrom(data);
        }

        public static GoddessEffectStruct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessEffectStruct) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessEffectStruct parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessEffectStruct) PARSER.parseFrom(data);
        }

        public static GoddessEffectStruct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessEffectStruct) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessEffectStruct parseFrom(InputStream input) throws IOException {
            return (GoddessEffectStruct) PARSER.parseFrom(input);
        }

        public static GoddessEffectStruct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEffectStruct) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessEffectStruct parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessEffectStruct) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessEffectStruct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEffectStruct) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessEffectStruct parseFrom(CodedInputStream input) throws IOException {
            return (GoddessEffectStruct) PARSER.parseFrom(input);
        }

        public static GoddessEffectStruct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEffectStruct) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessEffectStruct prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessEffectStructOrBuilder {
            private int bitField0_;
            private Object name_;
            private int value_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEffectStruct_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEffectStruct_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessEffectStruct.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessEffectStruct.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.value_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEffectStruct_descriptor;
            }

            public GoddessHandler.GoddessEffectStruct getDefaultInstanceForType() {
                return GoddessHandler.GoddessEffectStruct.getDefaultInstance();
            }

            public GoddessHandler.GoddessEffectStruct build() {
                GoddessHandler.GoddessEffectStruct result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessEffectStruct buildPartial() {
                GoddessHandler.GoddessEffectStruct result = new GoddessHandler.GoddessEffectStruct(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.value_ = this.value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessEffectStruct)
                    return mergeFrom((GoddessHandler.GoddessEffectStruct) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessEffectStruct other) {
                if (other == GoddessHandler.GoddessEffectStruct.getDefaultInstance()) return this;
                if (other.hasName()) {
                    this.bitField0_ |= 0x1;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasValue()) setValue(other.getValue());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasName()) return false;
                if (!hasValue()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessEffectStruct parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessEffectStruct) GoddessHandler.GoddessEffectStruct.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessEffectStruct) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.name_ = GoddessHandler.GoddessEffectStruct.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasValue() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getValue() {
                return this.value_;
            }

            public Builder setValue(int value) {
                this.bitField0_ |= 0x2;
                this.value_ = value;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.value_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessDetail
            extends GeneratedMessage
            implements GoddessDetailOrBuilder {
        private static final GoddessDetail defaultInstance = new GoddessDetail(true);
        private final UnknownFieldSet unknownFields;

        private GoddessDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessDetail getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    GoddessHandler.GoddessBasic.Builder builder;
                    GoddessHandler.GoddessSkill.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            builder = null;
                            if ((this.bitField0_ & 0x1) == 1) builder = this.basic_.toBuilder();
                            this.basic_ = (GoddessHandler.GoddessBasic) input.readMessage(GoddessHandler.GoddessBasic.PARSER, extensionRegistry);
                            if (builder != null) {
                                builder.mergeFrom(this.basic_);
                                this.basic_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 0x1;
                            break;
                        case 18:
                            if ((mutable_bitField0_ & 0x2) != 2) {
                                this.atts_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.atts_.add(input.readMessage(GoddessHandler.GoddessEffectStruct.PARSER, extensionRegistry));
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x2) == 2) subBuilder = this.mainSkill_.toBuilder();
                            this.mainSkill_ = (GoddessHandler.GoddessSkill) input.readMessage(GoddessHandler.GoddessSkill.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.mainSkill_);
                                this.mainSkill_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x2;
                            break;
                        case 34:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.assistSkill_.toBuilder();
                            this.assistSkill_ = (GoddessHandler.GoddessSkill) input.readMessage(GoddessHandler.GoddessSkill.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.assistSkill_);
                                this.assistSkill_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x2) == 2) this.atts_ = Collections.unmodifiableList(this.atts_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessDetail.class, Builder.class);
        }

        public static Parser<GoddessDetail> PARSER = (Parser<GoddessDetail>) new AbstractParser<GoddessDetail>() {
            public GoddessHandler.GoddessDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int BASIC_FIELD_NUMBER = 1;
        private GoddessHandler.GoddessBasic basic_;
        public static final int ATTS_FIELD_NUMBER = 2;
        private List<GoddessHandler.GoddessEffectStruct> atts_;
        public static final int MAINSKILL_FIELD_NUMBER = 3;
        private GoddessHandler.GoddessSkill mainSkill_;
        public static final int ASSISTSKILL_FIELD_NUMBER = 4;
        private GoddessHandler.GoddessSkill assistSkill_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasBasic() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public GoddessHandler.GoddessBasic getBasic() {
            return this.basic_;
        }

        public GoddessHandler.GoddessBasicOrBuilder getBasicOrBuilder() {
            return this.basic_;
        }

        public List<GoddessHandler.GoddessEffectStruct> getAttsList() {
            return this.atts_;
        }

        public List<? extends GoddessHandler.GoddessEffectStructOrBuilder> getAttsOrBuilderList() {
            return (List) this.atts_;
        }

        public int getAttsCount() {
            return this.atts_.size();
        }

        static {
            defaultInstance.initFields();
        }

        public GoddessHandler.GoddessEffectStruct getAtts(int index) {
            return this.atts_.get(index);
        }

        public GoddessHandler.GoddessEffectStructOrBuilder getAttsOrBuilder(int index) {
            return this.atts_.get(index);
        }

        public boolean hasMainSkill() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public GoddessHandler.GoddessSkill getMainSkill() {
            return this.mainSkill_;
        }

        public GoddessHandler.GoddessSkillOrBuilder getMainSkillOrBuilder() {
            return this.mainSkill_;
        }

        public boolean hasAssistSkill() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GoddessHandler.GoddessSkill getAssistSkill() {
            return this.assistSkill_;
        }

        public GoddessHandler.GoddessSkillOrBuilder getAssistSkillOrBuilder() {
            return this.assistSkill_;
        }

        private void initFields() {
            this.basic_ = GoddessHandler.GoddessBasic.getDefaultInstance();
            this.atts_ = Collections.emptyList();
            this.mainSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
            this.assistSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasBasic()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!getBasic().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getAttsCount(); i++) {
                if (!getAtts(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasMainSkill() && !getMainSkill().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasAssistSkill() && !getAssistSkill().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeMessage(1, (MessageLite) this.basic_);
            for (int i = 0; i < this.atts_.size(); i++)
                output.writeMessage(2, (MessageLite) this.atts_.get(i));
            if ((this.bitField0_ & 0x2) == 2)
                output.writeMessage(3, (MessageLite) this.mainSkill_);
            if ((this.bitField0_ & 0x4) == 4)
                output.writeMessage(4, (MessageLite) this.assistSkill_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.basic_);
            for (int i = 0; i < this.atts_.size(); i++)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.atts_.get(i));
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.mainSkill_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.assistSkill_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessDetail) PARSER.parseFrom(data);
        }

        public static GoddessDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessDetail) PARSER.parseFrom(data);
        }

        public static GoddessDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessDetail parseFrom(InputStream input) throws IOException {
            return (GoddessDetail) PARSER.parseFrom(input);
        }

        public static GoddessDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessDetail) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessDetail parseFrom(CodedInputStream input) throws IOException {
            return (GoddessDetail) PARSER.parseFrom(input);
        }

        public static GoddessDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessDetailOrBuilder {
            private int bitField0_;
            private GoddessHandler.GoddessBasic basic_;
            private SingleFieldBuilder<GoddessHandler.GoddessBasic, GoddessHandler.GoddessBasic.Builder, GoddessHandler.GoddessBasicOrBuilder> basicBuilder_;
            private List<GoddessHandler.GoddessEffectStruct> atts_;
            private RepeatedFieldBuilder<GoddessHandler.GoddessEffectStruct, GoddessHandler.GoddessEffectStruct.Builder, GoddessHandler.GoddessEffectStructOrBuilder> attsBuilder_;
            private GoddessHandler.GoddessSkill mainSkill_;
            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> mainSkillBuilder_;
            private GoddessHandler.GoddessSkill assistSkill_;
            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> assistSkillBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessDetail.class, Builder.class);
            }

            private Builder() {
                this.basic_ = GoddessHandler.GoddessBasic.getDefaultInstance();
                this.atts_ = Collections.emptyList();
                this.mainSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                this.assistSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.basic_ = GoddessHandler.GoddessBasic.getDefaultInstance();
                this.atts_ = Collections.emptyList();
                this.mainSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                this.assistSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessDetail.alwaysUseFieldBuilders) {
                    getBasicFieldBuilder();
                    getAttsFieldBuilder();
                    getMainSkillFieldBuilder();
                    getAssistSkillFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (this.basicBuilder_ == null) {
                    this.basic_ = GoddessHandler.GoddessBasic.getDefaultInstance();
                } else {
                    this.basicBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.attsBuilder_ == null) {
                    this.atts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.attsBuilder_.clear();
                }
                if (this.mainSkillBuilder_ == null) {
                    this.mainSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                } else {
                    this.mainSkillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.assistSkillBuilder_ == null) {
                    this.assistSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                } else {
                    this.assistSkillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessDetail_descriptor;
            }

            public GoddessHandler.GoddessDetail getDefaultInstanceForType() {
                return GoddessHandler.GoddessDetail.getDefaultInstance();
            }

            public GoddessHandler.GoddessDetail build() {
                GoddessHandler.GoddessDetail result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessDetail buildPartial() {
                GoddessHandler.GoddessDetail result = new GoddessHandler.GoddessDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                if (this.basicBuilder_ == null) {
                    result.basic_ = this.basic_;
                } else {
                    result.basic_ = (GoddessHandler.GoddessBasic) this.basicBuilder_.build();
                }
                if (this.attsBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2) {
                        this.atts_ = Collections.unmodifiableList(this.atts_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.atts_ = this.atts_;
                } else {
                    result.atts_ = this.attsBuilder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x2;
                if (this.mainSkillBuilder_ == null) {
                    result.mainSkill_ = this.mainSkill_;
                } else {
                    result.mainSkill_ = (GoddessHandler.GoddessSkill) this.mainSkillBuilder_.build();
                }
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x4;
                if (this.assistSkillBuilder_ == null) {
                    result.assistSkill_ = this.assistSkill_;
                } else {
                    result.assistSkill_ = (GoddessHandler.GoddessSkill) this.assistSkillBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessDetail)
                    return mergeFrom((GoddessHandler.GoddessDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessDetail other) {
                if (other == GoddessHandler.GoddessDetail.getDefaultInstance())
                    return this;
                if (other.hasBasic())
                    mergeBasic(other.getBasic());
                if (this.attsBuilder_ == null) {
                    if (!other.atts_.isEmpty()) {
                        if (this.atts_.isEmpty()) {
                            this.atts_ = other.atts_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        } else {
                            ensureAttsIsMutable();
                            this.atts_.addAll(other.atts_);
                        }
                        onChanged();
                    }
                } else if (!other.atts_.isEmpty()) {
                    if (this.attsBuilder_.isEmpty()) {
                        this.attsBuilder_.dispose();
                        this.attsBuilder_ = null;
                        this.atts_ = other.atts_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.attsBuilder_ = GoddessHandler.GoddessDetail.alwaysUseFieldBuilders ? getAttsFieldBuilder() : null;
                    } else {
                        this.attsBuilder_.addAllMessages(other.atts_);
                    }
                }
                if (other.hasMainSkill())
                    mergeMainSkill(other.getMainSkill());
                if (other.hasAssistSkill())
                    mergeAssistSkill(other.getAssistSkill());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasBasic())
                    return false;
                if (!getBasic().isInitialized())
                    return false;
                for (int i = 0; i < getAttsCount(); i++) {
                    if (!getAtts(i).isInitialized())
                        return false;
                }
                if (hasMainSkill() && !getMainSkill().isInitialized())
                    return false;
                if (hasAssistSkill() && !getAssistSkill().isInitialized())
                    return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessDetail parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessDetail) GoddessHandler.GoddessDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasBasic() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public GoddessHandler.GoddessBasic getBasic() {
                if (this.basicBuilder_ == null)
                    return this.basic_;
                return (GoddessHandler.GoddessBasic) this.basicBuilder_.getMessage();
            }

            public Builder setBasic(GoddessHandler.GoddessBasic value) {
                if (this.basicBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    this.basic_ = value;
                    onChanged();
                } else {
                    this.basicBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder setBasic(GoddessHandler.GoddessBasic.Builder builderForValue) {
                if (this.basicBuilder_ == null) {
                    this.basic_ = builderForValue.build();
                    onChanged();
                } else {
                    this.basicBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder mergeBasic(GoddessHandler.GoddessBasic value) {
                if (this.basicBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) == 1 && this.basic_ != GoddessHandler.GoddessBasic.getDefaultInstance()) {
                        this.basic_ = GoddessHandler.GoddessBasic.newBuilder(this.basic_).mergeFrom(value).buildPartial();
                    } else {
                        this.basic_ = value;
                    }
                    onChanged();
                } else {
                    this.basicBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x1;
                return this;
            }

            public Builder clearBasic() {
                if (this.basicBuilder_ == null) {
                    this.basic_ = GoddessHandler.GoddessBasic.getDefaultInstance();
                    onChanged();
                } else {
                    this.basicBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public GoddessHandler.GoddessBasic.Builder getBasicBuilder() {
                this.bitField0_ |= 0x1;
                onChanged();
                return (GoddessHandler.GoddessBasic.Builder) getBasicFieldBuilder().getBuilder();
            }

            public GoddessHandler.GoddessBasicOrBuilder getBasicOrBuilder() {
                if (this.basicBuilder_ != null)
                    return (GoddessHandler.GoddessBasicOrBuilder) this.basicBuilder_.getMessageOrBuilder();
                return this.basic_;
            }

            private SingleFieldBuilder<GoddessHandler.GoddessBasic, GoddessHandler.GoddessBasic.Builder, GoddessHandler.GoddessBasicOrBuilder> getBasicFieldBuilder() {
                if (this.basicBuilder_ == null) {
                    this.basicBuilder_ = new SingleFieldBuilder(getBasic(), getParentForChildren(), isClean());
                    this.basic_ = null;
                }
                return this.basicBuilder_;
            }

            private void ensureAttsIsMutable() {
                if ((this.bitField0_ & 0x2) != 2) {
                    this.atts_ = new ArrayList<>(this.atts_);
                    this.bitField0_ |= 0x2;
                }
            }

            public List<GoddessHandler.GoddessEffectStruct> getAttsList() {
                if (this.attsBuilder_ == null)
                    return Collections.unmodifiableList(this.atts_);
                return this.attsBuilder_.getMessageList();
            }

            public int getAttsCount() {
                if (this.attsBuilder_ == null)
                    return this.atts_.size();
                return this.attsBuilder_.getCount();
            }

            public GoddessHandler.GoddessEffectStruct getAtts(int index) {
                if (this.attsBuilder_ == null)
                    return this.atts_.get(index);
                return (GoddessHandler.GoddessEffectStruct) this.attsBuilder_.getMessage(index);
            }

            public Builder setAtts(int index, GoddessHandler.GoddessEffectStruct value) {
                if (this.attsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureAttsIsMutable();
                    this.atts_.set(index, value);
                    onChanged();
                } else {
                    this.attsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setAtts(int index, GoddessHandler.GoddessEffectStruct.Builder builderForValue) {
                if (this.attsBuilder_ == null) {
                    ensureAttsIsMutable();
                    this.atts_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.attsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAtts(GoddessHandler.GoddessEffectStruct value) {
                if (this.attsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureAttsIsMutable();
                    this.atts_.add(value);
                    onChanged();
                } else {
                    this.attsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addAtts(int index, GoddessHandler.GoddessEffectStruct value) {
                if (this.attsBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureAttsIsMutable();
                    this.atts_.add(index, value);
                    onChanged();
                } else {
                    this.attsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addAtts(GoddessHandler.GoddessEffectStruct.Builder builderForValue) {
                if (this.attsBuilder_ == null) {
                    ensureAttsIsMutable();
                    this.atts_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.attsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addAtts(int index, GoddessHandler.GoddessEffectStruct.Builder builderForValue) {
                if (this.attsBuilder_ == null) {
                    ensureAttsIsMutable();
                    this.atts_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.attsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllAtts(Iterable<? extends GoddessHandler.GoddessEffectStruct> values) {
                if (this.attsBuilder_ == null) {
                    ensureAttsIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.atts_);
                    onChanged();
                } else {
                    this.attsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearAtts() {
                if (this.attsBuilder_ == null) {
                    this.atts_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    onChanged();
                } else {
                    this.attsBuilder_.clear();
                }
                return this;
            }

            public Builder removeAtts(int index) {
                if (this.attsBuilder_ == null) {
                    ensureAttsIsMutable();
                    this.atts_.remove(index);
                    onChanged();
                } else {
                    this.attsBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessEffectStruct.Builder getAttsBuilder(int index) {
                return (GoddessHandler.GoddessEffectStruct.Builder) getAttsFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessEffectStructOrBuilder getAttsOrBuilder(int index) {
                if (this.attsBuilder_ == null)
                    return this.atts_.get(index);
                return (GoddessHandler.GoddessEffectStructOrBuilder) this.attsBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessEffectStructOrBuilder> getAttsOrBuilderList() {
                if (this.attsBuilder_ != null)
                    return this.attsBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.atts_);
            }

            public GoddessHandler.GoddessEffectStruct.Builder addAttsBuilder() {
                return (GoddessHandler.GoddessEffectStruct.Builder) getAttsFieldBuilder().addBuilder(GoddessHandler.GoddessEffectStruct.getDefaultInstance());
            }

            public GoddessHandler.GoddessEffectStruct.Builder addAttsBuilder(int index) {
                return (GoddessHandler.GoddessEffectStruct.Builder) getAttsFieldBuilder().addBuilder(index, GoddessHandler.GoddessEffectStruct.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessEffectStruct.Builder> getAttsBuilderList() {
                return getAttsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessEffectStruct, GoddessHandler.GoddessEffectStruct.Builder, GoddessHandler.GoddessEffectStructOrBuilder> getAttsFieldBuilder() {
                if (this.attsBuilder_ == null) {
                    this.attsBuilder_ = new RepeatedFieldBuilder(this.atts_, ((this.bitField0_ & 0x2) == 2), getParentForChildren(), isClean());
                    this.atts_ = null;
                }
                return this.attsBuilder_;
            }

            public boolean hasMainSkill() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GoddessHandler.GoddessSkill getMainSkill() {
                if (this.mainSkillBuilder_ == null)
                    return this.mainSkill_;
                return (GoddessHandler.GoddessSkill) this.mainSkillBuilder_.getMessage();
            }

            public Builder setMainSkill(GoddessHandler.GoddessSkill value) {
                if (this.mainSkillBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    this.mainSkill_ = value;
                    onChanged();
                } else {
                    this.mainSkillBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setMainSkill(GoddessHandler.GoddessSkill.Builder builderForValue) {
                if (this.mainSkillBuilder_ == null) {
                    this.mainSkill_ = builderForValue.build();
                    onChanged();
                } else {
                    this.mainSkillBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeMainSkill(GoddessHandler.GoddessSkill value) {
                if (this.mainSkillBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.mainSkill_ != GoddessHandler.GoddessSkill.getDefaultInstance()) {
                        this.mainSkill_ = GoddessHandler.GoddessSkill.newBuilder(this.mainSkill_).mergeFrom(value).buildPartial();
                    } else {
                        this.mainSkill_ = value;
                    }
                    onChanged();
                } else {
                    this.mainSkillBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearMainSkill() {
                if (this.mainSkillBuilder_ == null) {
                    this.mainSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                    onChanged();
                } else {
                    this.mainSkillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GoddessHandler.GoddessSkill.Builder getMainSkillBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GoddessHandler.GoddessSkill.Builder) getMainSkillFieldBuilder().getBuilder();
            }

            public GoddessHandler.GoddessSkillOrBuilder getMainSkillOrBuilder() {
                if (this.mainSkillBuilder_ != null)
                    return (GoddessHandler.GoddessSkillOrBuilder) this.mainSkillBuilder_.getMessageOrBuilder();
                return this.mainSkill_;
            }

            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> getMainSkillFieldBuilder() {
                if (this.mainSkillBuilder_ == null) {
                    this.mainSkillBuilder_ = new SingleFieldBuilder(getMainSkill(), getParentForChildren(), isClean());
                    this.mainSkill_ = null;
                }
                return this.mainSkillBuilder_;
            }

            public boolean hasAssistSkill() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public GoddessHandler.GoddessSkill getAssistSkill() {
                if (this.assistSkillBuilder_ == null)
                    return this.assistSkill_;
                return (GoddessHandler.GoddessSkill) this.assistSkillBuilder_.getMessage();
            }

            public Builder setAssistSkill(GoddessHandler.GoddessSkill value) {
                if (this.assistSkillBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    this.assistSkill_ = value;
                    onChanged();
                } else {
                    this.assistSkillBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder setAssistSkill(GoddessHandler.GoddessSkill.Builder builderForValue) {
                if (this.assistSkillBuilder_ == null) {
                    this.assistSkill_ = builderForValue.build();
                    onChanged();
                } else {
                    this.assistSkillBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder mergeAssistSkill(GoddessHandler.GoddessSkill value) {
                if (this.assistSkillBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8 && this.assistSkill_ != GoddessHandler.GoddessSkill.getDefaultInstance()) {
                        this.assistSkill_ = GoddessHandler.GoddessSkill.newBuilder(this.assistSkill_).mergeFrom(value).buildPartial();
                    } else {
                        this.assistSkill_ = value;
                    }
                    onChanged();
                } else {
                    this.assistSkillBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder clearAssistSkill() {
                if (this.assistSkillBuilder_ == null) {
                    this.assistSkill_ = GoddessHandler.GoddessSkill.getDefaultInstance();
                    onChanged();
                } else {
                    this.assistSkillBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public GoddessHandler.GoddessSkill.Builder getAssistSkillBuilder() {
                this.bitField0_ |= 0x8;
                onChanged();
                return (GoddessHandler.GoddessSkill.Builder) getAssistSkillFieldBuilder().getBuilder();
            }

            public GoddessHandler.GoddessSkillOrBuilder getAssistSkillOrBuilder() {
                if (this.assistSkillBuilder_ != null)
                    return (GoddessHandler.GoddessSkillOrBuilder) this.assistSkillBuilder_.getMessageOrBuilder();
                return this.assistSkill_;
            }

            private SingleFieldBuilder<GoddessHandler.GoddessSkill, GoddessHandler.GoddessSkill.Builder, GoddessHandler.GoddessSkillOrBuilder> getAssistSkillFieldBuilder() {
                if (this.assistSkillBuilder_ == null) {
                    this.assistSkillBuilder_ = new SingleFieldBuilder(getAssistSkill(), getParentForChildren(), isClean());
                    this.assistSkill_ = null;
                }
                return this.assistSkillBuilder_;
            }
        }
    }

    public static final class EnterGoddessSceneResponse extends GeneratedMessage implements EnterGoddessSceneResponseOrBuilder {
        private static final EnterGoddessSceneResponse defaultInstance = new EnterGoddessSceneResponse(true);
        private final UnknownFieldSet unknownFields;

        private EnterGoddessSceneResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private EnterGoddessSceneResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static EnterGoddessSceneResponse getDefaultInstance() {
            return defaultInstance;
        }

        public EnterGoddessSceneResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EnterGoddessSceneResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterGoddessSceneResponse.class, Builder.class);
        }

        public static Parser<EnterGoddessSceneResponse> PARSER = (Parser<EnterGoddessSceneResponse>) new AbstractParser<EnterGoddessSceneResponse>() {
            public GoddessHandler.EnterGoddessSceneResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.EnterGoddessSceneResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<EnterGoddessSceneResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static EnterGoddessSceneResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(data);
        }

        public static EnterGoddessSceneResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EnterGoddessSceneResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(data);
        }

        public static EnterGoddessSceneResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static EnterGoddessSceneResponse parseFrom(InputStream input) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(input);
        }

        public static EnterGoddessSceneResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static EnterGoddessSceneResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseDelimitedFrom(input);
        }

        public static EnterGoddessSceneResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static EnterGoddessSceneResponse parseFrom(CodedInputStream input) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(input);
        }

        public static EnterGoddessSceneResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (EnterGoddessSceneResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(EnterGoddessSceneResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.EnterGoddessSceneResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.EnterGoddessSceneResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.EnterGoddessSceneResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_EnterGoddessSceneResponse_descriptor;
            }

            public GoddessHandler.EnterGoddessSceneResponse getDefaultInstanceForType() {
                return GoddessHandler.EnterGoddessSceneResponse.getDefaultInstance();
            }

            public GoddessHandler.EnterGoddessSceneResponse build() {
                GoddessHandler.EnterGoddessSceneResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.EnterGoddessSceneResponse buildPartial() {
                GoddessHandler.EnterGoddessSceneResponse result = new GoddessHandler.EnterGoddessSceneResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.EnterGoddessSceneResponse)
                    return mergeFrom((GoddessHandler.EnterGoddessSceneResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.EnterGoddessSceneResponse other) {
                if (other == GoddessHandler.EnterGoddessSceneResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.EnterGoddessSceneResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.EnterGoddessSceneResponse) GoddessHandler.EnterGoddessSceneResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.EnterGoddessSceneResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.EnterGoddessSceneResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }


    public static final class OutGoddessSceneResponse
            extends GeneratedMessage
            implements OutGoddessSceneResponseOrBuilder {
        private static final OutGoddessSceneResponse defaultInstance = new OutGoddessSceneResponse(true);
        private final UnknownFieldSet unknownFields;

        private OutGoddessSceneResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OutGoddessSceneResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OutGoddessSceneResponse getDefaultInstance() {
            return defaultInstance;
        }

        public OutGoddessSceneResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OutGoddessSceneResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OutGoddessSceneResponse.class, Builder.class);
        }

        public static Parser<OutGoddessSceneResponse> PARSER = (Parser<OutGoddessSceneResponse>) new AbstractParser<OutGoddessSceneResponse>() {
            public GoddessHandler.OutGoddessSceneResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OutGoddessSceneResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OutGoddessSceneResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OutGoddessSceneResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(data);
        }

        public static OutGoddessSceneResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OutGoddessSceneResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(data);
        }

        public static OutGoddessSceneResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OutGoddessSceneResponse parseFrom(InputStream input) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(input);
        }

        public static OutGoddessSceneResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OutGoddessSceneResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseDelimitedFrom(input);
        }

        public static OutGoddessSceneResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OutGoddessSceneResponse parseFrom(CodedInputStream input) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(input);
        }

        public static OutGoddessSceneResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutGoddessSceneResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OutGoddessSceneResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OutGoddessSceneResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OutGoddessSceneResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OutGoddessSceneResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OutGoddessSceneResponse_descriptor;
            }

            public GoddessHandler.OutGoddessSceneResponse getDefaultInstanceForType() {
                return GoddessHandler.OutGoddessSceneResponse.getDefaultInstance();
            }

            public GoddessHandler.OutGoddessSceneResponse build() {
                GoddessHandler.OutGoddessSceneResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OutGoddessSceneResponse buildPartial() {
                GoddessHandler.OutGoddessSceneResponse result = new GoddessHandler.OutGoddessSceneResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OutGoddessSceneResponse)
                    return mergeFrom((GoddessHandler.OutGoddessSceneResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OutGoddessSceneResponse other) {
                if (other == GoddessHandler.OutGoddessSceneResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OutGoddessSceneResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OutGoddessSceneResponse) GoddessHandler.OutGoddessSceneResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OutGoddessSceneResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.OutGoddessSceneResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ActiveGoddessResponse
            extends GeneratedMessage
            implements ActiveGoddessResponseOrBuilder {
        private static final ActiveGoddessResponse defaultInstance = new ActiveGoddessResponse(true);
        private final UnknownFieldSet unknownFields;

        private ActiveGoddessResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ActiveGoddessResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ActiveGoddessResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ActiveGoddessResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ActiveGoddessResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_ActiveGoddessResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_ActiveGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ActiveGoddessResponse.class, Builder.class);
        }

        public static Parser<ActiveGoddessResponse> PARSER = (Parser<ActiveGoddessResponse>) new AbstractParser<ActiveGoddessResponse>() {
            public GoddessHandler.ActiveGoddessResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.ActiveGoddessResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ActiveGoddessResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ActiveGoddessResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ActiveGoddessResponse) PARSER.parseFrom(data);
        }

        public static ActiveGoddessResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ActiveGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ActiveGoddessResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ActiveGoddessResponse) PARSER.parseFrom(data);
        }

        public static ActiveGoddessResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ActiveGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ActiveGoddessResponse parseFrom(InputStream input) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseFrom(input);
        }

        public static ActiveGoddessResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ActiveGoddessResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ActiveGoddessResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ActiveGoddessResponse parseFrom(CodedInputStream input) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseFrom(input);
        }

        public static ActiveGoddessResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ActiveGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ActiveGoddessResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.ActiveGoddessResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.ActiveGoddessResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.ActiveGoddessResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_ActiveGoddessResponse_descriptor;
            }

            public GoddessHandler.ActiveGoddessResponse getDefaultInstanceForType() {
                return GoddessHandler.ActiveGoddessResponse.getDefaultInstance();
            }

            public GoddessHandler.ActiveGoddessResponse build() {
                GoddessHandler.ActiveGoddessResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.ActiveGoddessResponse buildPartial() {
                GoddessHandler.ActiveGoddessResponse result = new GoddessHandler.ActiveGoddessResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.ActiveGoddessResponse)
                    return mergeFrom((GoddessHandler.ActiveGoddessResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.ActiveGoddessResponse other) {
                if (other == GoddessHandler.ActiveGoddessResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.ActiveGoddessResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.ActiveGoddessResponse) GoddessHandler.ActiveGoddessResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.ActiveGoddessResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.ActiveGoddessResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OnBattleGoddessResponse
            extends GeneratedMessage
            implements OnBattleGoddessResponseOrBuilder {
        private static final OnBattleGoddessResponse defaultInstance = new OnBattleGoddessResponse(true);
        private final UnknownFieldSet unknownFields;

        private OnBattleGoddessResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OnBattleGoddessResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OnBattleGoddessResponse getDefaultInstance() {
            return defaultInstance;
        }

        public OnBattleGoddessResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OnBattleGoddessResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OnBattleGoddessResponse.class, Builder.class);
        }

        public static Parser<OnBattleGoddessResponse> PARSER = (Parser<OnBattleGoddessResponse>) new AbstractParser<OnBattleGoddessResponse>() {
            public GoddessHandler.OnBattleGoddessResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OnBattleGoddessResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OnBattleGoddessResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OnBattleGoddessResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(data);
        }

        public static OnBattleGoddessResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnBattleGoddessResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(data);
        }

        public static OnBattleGoddessResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnBattleGoddessResponse parseFrom(InputStream input) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(input);
        }

        public static OnBattleGoddessResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OnBattleGoddessResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseDelimitedFrom(input);
        }

        public static OnBattleGoddessResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OnBattleGoddessResponse parseFrom(CodedInputStream input) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(input);
        }

        public static OnBattleGoddessResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnBattleGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OnBattleGoddessResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OnBattleGoddessResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OnBattleGoddessResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OnBattleGoddessResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OnBattleGoddessResponse_descriptor;
            }

            public GoddessHandler.OnBattleGoddessResponse getDefaultInstanceForType() {
                return GoddessHandler.OnBattleGoddessResponse.getDefaultInstance();
            }

            public GoddessHandler.OnBattleGoddessResponse build() {
                GoddessHandler.OnBattleGoddessResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OnBattleGoddessResponse buildPartial() {
                GoddessHandler.OnBattleGoddessResponse result = new GoddessHandler.OnBattleGoddessResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OnBattleGoddessResponse)
                    return mergeFrom((GoddessHandler.OnBattleGoddessResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OnBattleGoddessResponse other) {
                if (other == GoddessHandler.OnBattleGoddessResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OnBattleGoddessResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OnBattleGoddessResponse) GoddessHandler.OnBattleGoddessResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OnBattleGoddessResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.OnBattleGoddessResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OffBattleGoddessResponse
            extends GeneratedMessage
            implements OffBattleGoddessResponseOrBuilder {
        private static final OffBattleGoddessResponse defaultInstance = new OffBattleGoddessResponse(true);
        private final UnknownFieldSet unknownFields;

        private OffBattleGoddessResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OffBattleGoddessResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OffBattleGoddessResponse getDefaultInstance() {
            return defaultInstance;
        }

        public OffBattleGoddessResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OffBattleGoddessResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OffBattleGoddessResponse.class, Builder.class);
        }

        public static Parser<OffBattleGoddessResponse> PARSER = (Parser<OffBattleGoddessResponse>) new AbstractParser<OffBattleGoddessResponse>() {
            public GoddessHandler.OffBattleGoddessResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.OffBattleGoddessResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OffBattleGoddessResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OffBattleGoddessResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(data);
        }

        public static OffBattleGoddessResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OffBattleGoddessResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(data);
        }

        public static OffBattleGoddessResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OffBattleGoddessResponse parseFrom(InputStream input) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(input);
        }

        public static OffBattleGoddessResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OffBattleGoddessResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseDelimitedFrom(input);
        }

        public static OffBattleGoddessResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OffBattleGoddessResponse parseFrom(CodedInputStream input) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(input);
        }

        public static OffBattleGoddessResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OffBattleGoddessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OffBattleGoddessResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.OffBattleGoddessResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.OffBattleGoddessResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.OffBattleGoddessResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_OffBattleGoddessResponse_descriptor;
            }

            public GoddessHandler.OffBattleGoddessResponse getDefaultInstanceForType() {
                return GoddessHandler.OffBattleGoddessResponse.getDefaultInstance();
            }

            public GoddessHandler.OffBattleGoddessResponse build() {
                GoddessHandler.OffBattleGoddessResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.OffBattleGoddessResponse buildPartial() {
                GoddessHandler.OffBattleGoddessResponse result = new GoddessHandler.OffBattleGoddessResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.OffBattleGoddessResponse)
                    return mergeFrom((GoddessHandler.OffBattleGoddessResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.OffBattleGoddessResponse other) {
                if (other == GoddessHandler.OffBattleGoddessResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.OffBattleGoddessResponse parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.OffBattleGoddessResponse) GoddessHandler.OffBattleGoddessResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.OffBattleGoddessResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GoddessHandler.OffBattleGoddessResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GoddessEquipDynamicPush
            extends GeneratedMessage
            implements GoddessEquipDynamicPushOrBuilder {
        private static final GoddessEquipDynamicPush defaultInstance = new GoddessEquipDynamicPush(true);
        private final UnknownFieldSet unknownFields;

        private GoddessEquipDynamicPush(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessEquipDynamicPush(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessEquipDynamicPush getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessEquipDynamicPush getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessEquipDynamicPush(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.s2CGoddessId_ = input.readInt32();
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.s2CData_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.s2CData_.add(input.readMessage(GoddessHandler.GoddessGiftBasic.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.s2CData_ = Collections.unmodifiableList(this.s2CData_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessEquipDynamicPush_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessEquipDynamicPush_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessEquipDynamicPush.class, Builder.class);
        }

        public static Parser<GoddessEquipDynamicPush> PARSER = (Parser<GoddessEquipDynamicPush>) new AbstractParser<GoddessEquipDynamicPush>() {
            public GoddessHandler.GoddessEquipDynamicPush parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessEquipDynamicPush(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_GODDESSID_FIELD_NUMBER = 2;
        private int s2CGoddessId_;
        public static final int S2C_DATA_FIELD_NUMBER = 3;
        private List<GoddessHandler.GoddessGiftBasic> s2CData_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessEquipDynamicPush> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CGoddessId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getS2CGoddessId() {
            return this.s2CGoddessId_;
        }

        static {
            defaultInstance.initFields();
        }


        public List<GoddessHandler.GoddessGiftBasic> getS2CDataList() {
            return this.s2CData_;
        }


        public List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getS2CDataOrBuilderList() {
            return (List) this.s2CData_;
        }


        public int getS2CDataCount() {
            return this.s2CData_.size();
        }


        public GoddessHandler.GoddessGiftBasic getS2CData(int index) {
            return this.s2CData_.get(index);
        }


        public GoddessHandler.GoddessGiftBasicOrBuilder getS2CDataOrBuilder(int index) {
            return this.s2CData_.get(index);
        }


        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CGoddessId_ = 0;
            this.s2CData_ = Collections.emptyList();
        }


        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasS2CGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getS2CDataCount(); i++) {
                if (!getS2CData(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }


        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) {
                output.writeInt32(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                output.writeInt32(2, this.s2CGoddessId_);
            }
            for (int i = 0; i < this.s2CData_.size(); i++) {
                output.writeMessage(3, (MessageLite) this.s2CData_.get(i));
            }
            getUnknownFields().writeTo(output);
        }


        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) {
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            }
            if ((this.bitField0_ & 0x2) == 2) {
                size += CodedOutputStream.computeInt32Size(2, this.s2CGoddessId_);
            }
            for (int i = 0; i < this.s2CData_.size(); i++) {
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2CData_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }


        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }


        public static GoddessEquipDynamicPush parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(data);
        }


        public static GoddessEquipDynamicPush parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessEquipDynamicPush parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(data);
        }


        public static GoddessEquipDynamicPush parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(data, extensionRegistry);
        }


        public static GoddessEquipDynamicPush parseFrom(InputStream input) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(input);
        }


        public static GoddessEquipDynamicPush parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(input, extensionRegistry);
        }


        public static GoddessEquipDynamicPush parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseDelimitedFrom(input);
        }


        public static GoddessEquipDynamicPush parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }


        public static GoddessEquipDynamicPush parseFrom(CodedInputStream input) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(input);
        }


        public static GoddessEquipDynamicPush parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessEquipDynamicPush) PARSER.parseFrom(input, extensionRegistry);
        }


        public static Builder newBuilder() {
            return Builder.create();
        }


        public Builder newBuilderForType() {
            return newBuilder();
        }


        public static Builder newBuilder(GoddessEquipDynamicPush prototype) {
            return newBuilder().mergeFrom(prototype);
        }


        public Builder toBuilder() {
            return newBuilder(this);
        }


        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }


        public static final class Builder
                extends GeneratedMessage.Builder<Builder>
                implements GoddessHandler.GoddessEquipDynamicPushOrBuilder {
            private int bitField0_;


            private int s2CCode_;


            private int s2CGoddessId_;


            private List<GoddessHandler.GoddessGiftBasic> s2CData_;


            private RepeatedFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> s2CDataBuilder_;


            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEquipDynamicPush_descriptor;
            }


            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEquipDynamicPush_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessEquipDynamicPush.class, Builder.class);
            }


            private Builder() {
                this.s2CData_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }


            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CData_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }


            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessEquipDynamicPush.alwaysUseFieldBuilders) {
                    getS2CDataFieldBuilder();
                }
            }


            private static Builder create() {
                return new Builder();
            }


            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2CDataBuilder_ == null) {
                    this.s2CData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.s2CDataBuilder_.clear();
                }
                return this;
            }


            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }


            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessEquipDynamicPush_descriptor;
            }


            public GoddessHandler.GoddessEquipDynamicPush getDefaultInstanceForType() {
                return GoddessHandler.GoddessEquipDynamicPush.getDefaultInstance();
            }


            public GoddessHandler.GoddessEquipDynamicPush build() {
                GoddessHandler.GoddessEquipDynamicPush result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }


            public GoddessHandler.GoddessEquipDynamicPush buildPartial() {
                GoddessHandler.GoddessEquipDynamicPush result = new GoddessHandler.GoddessEquipDynamicPush(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) {
                    to_bitField0_ |= 0x1;
                }
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) {
                    to_bitField0_ |= 0x2;
                }
                result.s2CGoddessId_ = this.s2CGoddessId_;
                if (this.s2CDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.s2CData_ = Collections.unmodifiableList(this.s2CData_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.s2CData_ = this.s2CData_;
                } else {
                    result.s2CData_ = this.s2CDataBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }


            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessEquipDynamicPush) {
                    return mergeFrom((GoddessHandler.GoddessEquipDynamicPush) other);
                }
                super.mergeFrom(other);
                return this;
            }


            public Builder mergeFrom(GoddessHandler.GoddessEquipDynamicPush other) {
                if (other == GoddessHandler.GoddessEquipDynamicPush.getDefaultInstance()) {
                    return this;
                }
                if (other.hasS2CCode()) {
                    setS2CCode(other.getS2CCode());
                }
                if (other.hasS2CGoddessId()) {
                    setS2CGoddessId(other.getS2CGoddessId());
                }
                if (this.s2CDataBuilder_ == null) {
                    if (!other.s2CData_.isEmpty()) {
                        if (this.s2CData_.isEmpty()) {
                            this.s2CData_ = other.s2CData_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureS2CDataIsMutable();
                            this.s2CData_.addAll(other.s2CData_);
                        }
                        onChanged();
                    }
                } else if (!other.s2CData_.isEmpty()) {
                    if (this.s2CDataBuilder_.isEmpty()) {
                        this.s2CDataBuilder_.dispose();
                        this.s2CDataBuilder_ = null;
                        this.s2CData_ = other.s2CData_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.s2CDataBuilder_ = GoddessHandler.GoddessEquipDynamicPush.alwaysUseFieldBuilders ? getS2CDataFieldBuilder() : null;
                    } else {
                        this.s2CDataBuilder_.addAllMessages(other.s2CData_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }


            public final boolean isInitialized() {
                if (!hasS2CCode()) {
                    return false;
                }
                if (!hasS2CGoddessId()) {
                    return false;
                }
                for (int i = 0; i < getS2CDataCount(); i++) {
                    if (!getS2CData(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }


            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessEquipDynamicPush parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessEquipDynamicPush) GoddessHandler.GoddessEquipDynamicPush.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessEquipDynamicPush) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }


            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }


            public int getS2CCode() {
                return this.s2CCode_;
            }


            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }


            public boolean hasS2CGoddessId() {
                return ((this.bitField0_ & 0x2) == 2);
            }


            public int getS2CGoddessId() {
                return this.s2CGoddessId_;
            }


            public Builder setS2CGoddessId(int value) {
                this.bitField0_ |= 0x2;
                this.s2CGoddessId_ = value;
                onChanged();
                return this;
            }


            public Builder clearS2CGoddessId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CGoddessId_ = 0;
                onChanged();
                return this;
            }


            private void ensureS2CDataIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.s2CData_ = new ArrayList<>(this.s2CData_);
                    this.bitField0_ |= 0x4;
                }
            }


            public List<GoddessHandler.GoddessGiftBasic> getS2CDataList() {
                if (this.s2CDataBuilder_ == null) {
                    return Collections.unmodifiableList(this.s2CData_);
                }
                return this.s2CDataBuilder_.getMessageList();
            }


            public int getS2CDataCount() {
                if (this.s2CDataBuilder_ == null) {
                    return this.s2CData_.size();
                }
                return this.s2CDataBuilder_.getCount();
            }


            public GoddessHandler.GoddessGiftBasic getS2CData(int index) {
                if (this.s2CDataBuilder_ == null) {
                    return this.s2CData_.get(index);
                }
                return (GoddessHandler.GoddessGiftBasic) this.s2CDataBuilder_.getMessage(index);
            }


            public Builder setS2CData(int index, GoddessHandler.GoddessGiftBasic value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureS2CDataIsMutable();
                    this.s2CData_.set(index, value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.setMessage(index, value);
                }
                return this;
            }


            public Builder setS2CData(int index, GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }


            public Builder addS2CData(GoddessHandler.GoddessGiftBasic value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(value);
                }
                return this;
            }


            public Builder addS2CData(int index, GoddessHandler.GoddessGiftBasic value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(index, value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(index, value);
                }
                return this;
            }


            public Builder addS2CData(GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }


            public Builder addS2CData(int index, GoddessHandler.GoddessGiftBasic.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }


            public Builder addAllS2CData(Iterable<? extends GoddessHandler.GoddessGiftBasic> values) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.s2CData_);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addAllMessages(values);
                }
                return this;
            }


            public Builder clearS2CData() {
                if (this.s2CDataBuilder_ == null) {
                    this.s2CData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.s2CDataBuilder_.clear();
                }
                return this;
            }


            public Builder removeS2CData(int index) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.remove(index);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.remove(index);
                }
                return this;
            }


            public GoddessHandler.GoddessGiftBasic.Builder getS2CDataBuilder(int index) {
                return (GoddessHandler.GoddessGiftBasic.Builder) getS2CDataFieldBuilder().getBuilder(index);
            }


            public GoddessHandler.GoddessGiftBasicOrBuilder getS2CDataOrBuilder(int index) {
                if (this.s2CDataBuilder_ == null) {
                    return this.s2CData_.get(index);
                }
                return (GoddessHandler.GoddessGiftBasicOrBuilder) this.s2CDataBuilder_.getMessageOrBuilder(index);
            }


            public List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getS2CDataOrBuilderList() {
                if (this.s2CDataBuilder_ != null) {
                    return this.s2CDataBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List) this.s2CData_);
            }


            public GoddessHandler.GoddessGiftBasic.Builder addS2CDataBuilder() {
                return (GoddessHandler.GoddessGiftBasic.Builder) getS2CDataFieldBuilder().addBuilder(GoddessHandler.GoddessGiftBasic.getDefaultInstance());
            }


            public GoddessHandler.GoddessGiftBasic.Builder addS2CDataBuilder(int index) {
                return (GoddessHandler.GoddessGiftBasic.Builder) getS2CDataFieldBuilder().addBuilder(index, GoddessHandler.GoddessGiftBasic.getDefaultInstance());
            }


            public List<GoddessHandler.GoddessGiftBasic.Builder> getS2CDataBuilderList() {
                return getS2CDataFieldBuilder().getBuilderList();
            }


            private RepeatedFieldBuilder<GoddessHandler.GoddessGiftBasic, GoddessHandler.GoddessGiftBasic.Builder, GoddessHandler.GoddessGiftBasicOrBuilder> getS2CDataFieldBuilder() {
                if (this.s2CDataBuilder_ == null) {
                    this.s2CDataBuilder_ = new RepeatedFieldBuilder(this.s2CData_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.s2CData_ = null;
                }
                return this.s2CDataBuilder_;
            }
        }
    }


    public static final class GoddessGiftDynamicPush
            extends GeneratedMessage
            implements GoddessGiftDynamicPushOrBuilder {
        private static final GoddessGiftDynamicPush defaultInstance = new GoddessGiftDynamicPush(true);
        private final UnknownFieldSet unknownFields;

        private GoddessGiftDynamicPush(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GoddessGiftDynamicPush(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GoddessGiftDynamicPush getDefaultInstance() {
            return defaultInstance;
        }

        public GoddessGiftDynamicPush getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GoddessGiftDynamicPush(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.s2CGoddessId_ = input.readInt32();
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.s2CData_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.s2CData_.add(input.readMessage(GoddessHandler.GoddessGift.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.s2CData_ = Collections.unmodifiableList(this.s2CData_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGiftDynamicPush_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GoddessHandler.internal_static_pomelo_area_GoddessGiftDynamicPush_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessGiftDynamicPush.class, Builder.class);
        }

        public static Parser<GoddessGiftDynamicPush> PARSER = (Parser<GoddessGiftDynamicPush>) new AbstractParser<GoddessGiftDynamicPush>() {
            public GoddessHandler.GoddessGiftDynamicPush parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GoddessHandler.GoddessGiftDynamicPush(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_GODDESSID_FIELD_NUMBER = 2;
        private int s2CGoddessId_;
        public static final int S2C_DATA_FIELD_NUMBER = 3;
        private List<GoddessHandler.GoddessGift> s2CData_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GoddessGiftDynamicPush> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CGoddessId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getS2CGoddessId() {
            return this.s2CGoddessId_;
        }

        static {
            defaultInstance.initFields();
        }

        public List<GoddessHandler.GoddessGift> getS2CDataList() {
            return this.s2CData_;
        }

        public List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CDataOrBuilderList() {
            return (List) this.s2CData_;
        }

        public int getS2CDataCount() {
            return this.s2CData_.size();
        }

        public GoddessHandler.GoddessGift getS2CData(int index) {
            return this.s2CData_.get(index);
        }

        public GoddessHandler.GoddessGiftOrBuilder getS2CDataOrBuilder(int index) {
            return this.s2CData_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CGoddessId_ = 0;
            this.s2CData_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasS2CGoddessId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getS2CDataCount(); i++) {
                if (!getS2CData(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2)
                output.writeInt32(2, this.s2CGoddessId_);
            for (int i = 0; i < this.s2CData_.size(); i++)
                output.writeMessage(3, (MessageLite) this.s2CData_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeInt32Size(2, this.s2CGoddessId_);
            for (int i = 0; i < this.s2CData_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.s2CData_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GoddessGiftDynamicPush parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(data);
        }

        public static GoddessGiftDynamicPush parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGiftDynamicPush parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(data);
        }

        public static GoddessGiftDynamicPush parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GoddessGiftDynamicPush parseFrom(InputStream input) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(input);
        }

        public static GoddessGiftDynamicPush parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GoddessGiftDynamicPush parseDelimitedFrom(InputStream input) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseDelimitedFrom(input);
        }

        public static GoddessGiftDynamicPush parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GoddessGiftDynamicPush parseFrom(CodedInputStream input) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(input);
        }

        public static GoddessGiftDynamicPush parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GoddessGiftDynamicPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GoddessGiftDynamicPush prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GoddessHandler.GoddessGiftDynamicPushOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private int s2CGoddessId_;
            private List<GoddessHandler.GoddessGift> s2CData_;
            private RepeatedFieldBuilder<GoddessHandler.GoddessGift, GoddessHandler.GoddessGift.Builder, GoddessHandler.GoddessGiftOrBuilder> s2CDataBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftDynamicPush_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftDynamicPush_fieldAccessorTable.ensureFieldAccessorsInitialized(GoddessHandler.GoddessGiftDynamicPush.class, Builder.class);
            }

            private Builder() {
                this.s2CData_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CData_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GoddessHandler.GoddessGiftDynamicPush.alwaysUseFieldBuilders)
                    getS2CDataFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CGoddessId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.s2CDataBuilder_ == null) {
                    this.s2CData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.s2CDataBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GoddessHandler.internal_static_pomelo_area_GoddessGiftDynamicPush_descriptor;
            }

            public GoddessHandler.GoddessGiftDynamicPush getDefaultInstanceForType() {
                return GoddessHandler.GoddessGiftDynamicPush.getDefaultInstance();
            }

            public GoddessHandler.GoddessGiftDynamicPush build() {
                GoddessHandler.GoddessGiftDynamicPush result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GoddessHandler.GoddessGiftDynamicPush buildPartial() {
                GoddessHandler.GoddessGiftDynamicPush result = new GoddessHandler.GoddessGiftDynamicPush(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.s2CGoddessId_ = this.s2CGoddessId_;
                if (this.s2CDataBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.s2CData_ = Collections.unmodifiableList(this.s2CData_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.s2CData_ = this.s2CData_;
                } else {
                    result.s2CData_ = this.s2CDataBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GoddessHandler.GoddessGiftDynamicPush)
                    return mergeFrom((GoddessHandler.GoddessGiftDynamicPush) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GoddessHandler.GoddessGiftDynamicPush other) {
                if (other == GoddessHandler.GoddessGiftDynamicPush.getDefaultInstance())
                    return this;
                if (other.hasS2CCode())
                    setS2CCode(other.getS2CCode());
                if (other.hasS2CGoddessId())
                    setS2CGoddessId(other.getS2CGoddessId());
                if (this.s2CDataBuilder_ == null) {
                    if (!other.s2CData_.isEmpty()) {
                        if (this.s2CData_.isEmpty()) {
                            this.s2CData_ = other.s2CData_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureS2CDataIsMutable();
                            this.s2CData_.addAll(other.s2CData_);
                        }
                        onChanged();
                    }
                } else if (!other.s2CData_.isEmpty()) {
                    if (this.s2CDataBuilder_.isEmpty()) {
                        this.s2CDataBuilder_.dispose();
                        this.s2CDataBuilder_ = null;
                        this.s2CData_ = other.s2CData_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.s2CDataBuilder_ = GoddessHandler.GoddessGiftDynamicPush.alwaysUseFieldBuilders ? getS2CDataFieldBuilder() : null;
                    } else {
                        this.s2CDataBuilder_.addAllMessages(other.s2CData_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode())
                    return false;
                if (!hasS2CGoddessId())
                    return false;
                for (int i = 0; i < getS2CDataCount(); i++) {
                    if (!getS2CData(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GoddessHandler.GoddessGiftDynamicPush parsedMessage = null;
                try {
                    parsedMessage = (GoddessHandler.GoddessGiftDynamicPush) GoddessHandler.GoddessGiftDynamicPush.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GoddessHandler.GoddessGiftDynamicPush) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CGoddessId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getS2CGoddessId() {
                return this.s2CGoddessId_;
            }

            public Builder setS2CGoddessId(int value) {
                this.bitField0_ |= 0x2;
                this.s2CGoddessId_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CGoddessId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CGoddessId_ = 0;
                onChanged();
                return this;
            }

            private void ensureS2CDataIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.s2CData_ = new ArrayList<>(this.s2CData_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<GoddessHandler.GoddessGift> getS2CDataList() {
                if (this.s2CDataBuilder_ == null)
                    return Collections.unmodifiableList(this.s2CData_);
                return this.s2CDataBuilder_.getMessageList();
            }

            public int getS2CDataCount() {
                if (this.s2CDataBuilder_ == null)
                    return this.s2CData_.size();
                return this.s2CDataBuilder_.getCount();
            }

            public GoddessHandler.GoddessGift getS2CData(int index) {
                if (this.s2CDataBuilder_ == null)
                    return this.s2CData_.get(index);
                return (GoddessHandler.GoddessGift) this.s2CDataBuilder_.getMessage(index);
            }

            public Builder setS2CData(int index, GoddessHandler.GoddessGift value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CDataIsMutable();
                    this.s2CData_.set(index, value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setS2CData(int index, GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addS2CData(GoddessHandler.GoddessGift value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addS2CData(int index, GoddessHandler.GoddessGift value) {
                if (this.s2CDataBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(index, value);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addS2CData(GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addS2CData(int index, GoddessHandler.GoddessGift.Builder builderForValue) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllS2CData(Iterable<? extends GoddessHandler.GoddessGift> values) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.s2CData_);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearS2CData() {
                if (this.s2CDataBuilder_ == null) {
                    this.s2CData_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.s2CDataBuilder_.clear();
                }
                return this;
            }

            public Builder removeS2CData(int index) {
                if (this.s2CDataBuilder_ == null) {
                    ensureS2CDataIsMutable();
                    this.s2CData_.remove(index);
                    onChanged();
                } else {
                    this.s2CDataBuilder_.remove(index);
                }
                return this;
            }

            public GoddessHandler.GoddessGift.Builder getS2CDataBuilder(int index) {
                return (GoddessHandler.GoddessGift.Builder) getS2CDataFieldBuilder().getBuilder(index);
            }

            public GoddessHandler.GoddessGiftOrBuilder getS2CDataOrBuilder(int index) {
                if (this.s2CDataBuilder_ == null)
                    return this.s2CData_.get(index);
                return (GoddessHandler.GoddessGiftOrBuilder) this.s2CDataBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CDataOrBuilderList() {
                if (this.s2CDataBuilder_ != null)
                    return this.s2CDataBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.s2CData_);
            }

            public GoddessHandler.GoddessGift.Builder addS2CDataBuilder() {
                return (GoddessHandler.GoddessGift.Builder) getS2CDataFieldBuilder().addBuilder(GoddessHandler.GoddessGift.getDefaultInstance());
            }

            public GoddessHandler.GoddessGift.Builder addS2CDataBuilder(int index) {
                return (GoddessHandler.GoddessGift.Builder) getS2CDataFieldBuilder().addBuilder(index, GoddessHandler.GoddessGift.getDefaultInstance());
            }

            public List<GoddessHandler.GoddessGift.Builder> getS2CDataBuilderList() {
                return getS2CDataFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GoddessHandler.GoddessGift, GoddessHandler.GoddessGift.Builder, GoddessHandler.GoddessGiftOrBuilder> getS2CDataFieldBuilder() {
                if (this.s2CDataBuilder_ == null) {
                    this.s2CDataBuilder_ = new RepeatedFieldBuilder(this.s2CData_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.s2CData_ = null;
                }
                return this.s2CDataBuilder_;
            }
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }


    static {
        String[] descriptorData = {"\n\024goddessHandler.proto\022\013pomelo.area\032\fcommon.proto\"\032\n\030EnterGoddessSceneRequest\"\030\n\026OutGoddessSceneRequest\"5\n\024ActiveGoddessRequest\022\035\n\025c2s_goddessTemplateId\030\001 \002(\005\"/\n\026OnBattleGoddessRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\"0\n\027OffBattleGoddessRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\"(\n\017GetGiftsRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\";\n\016BuyGiftRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\022\022\n\nc2s_giftId\030\002 \002(\005\"?\n\022UnEquipGiftRequest\022\025\n\rc2s_goddessId\030", "\001 \002(\005\022\022\n\nc2s_giftId\030\002 \002(\005\"=\n\020EquipGiftRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\022\022\n\nc2s_giftId\030\002 \002(\005\"<\n\021UpIntimacyRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\022\020\n\bc2s_type\030\002 \002(\005\"&\n\rUpStarRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\"+\n\022GetCommInfoRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\"0\n\027GetGoddessDetailRequest\022\025\n\rc2s_goddessId\030\001 \002(\005\"\026\n\024GetAllGoddessRequest\"b\n\020GetGiftsResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022+\n\ts2c_gifts\030\003 \003(\0132\030.pomelo.area.Go", "ddessGift\"4\n\017BuyGiftResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"8\n\023UnEquipGiftResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"6\n\021EquipGiftResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"0\n\016GoddessAddProp\022\f\n\004name\030\001 \002(\t\022\020\n\baddValue\030\002 \002(\005\"\001\n\024GoddessUpgradeStruct\022\023\n\013actionCount\030\001 \002(\005\022-\n\baddProps\030\002 \003(\0132\033.pomelo.area.GoddessAddProp\022(\n\005skill\030\003 \001(\0132\031.pomelo.area.GoddessSkill\"m\n\025GoddessIntimacyStruct\022\020\n\bintimacy\030", "\001 \002(\005\022\025\n\rintimacyLevel\030\002 \002(\005\022\025\n\rintimacyStage\030\003 \002(\005\022\024\n\fneedIntimacy\030\004 \002(\005\"A\n\bCommInfo\022\f\n\004type\030\001 \002(\005\022\013\n\003exp\030\002 \002(\005\022\f\n\004cost\030\003 \002(\005\022\f\n\004name\030\004 \002(\t\"h\n\021GoddessCommStruct\022\024\n\fcurCommCount\030\001 \002(\005\022\024\n\fmaxCommCount\030\002 \002(\005\022'\n\bcommInfo\030\003 \003(\0132\025.pomelo.area.CommInfo\"n\n\023GetCommInfoResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\0224\n\fs2c_commData\030\003 \001(\0132\036.pomelo.area.GoddessCommStruct\"Ã\001\n\022UpIntimacyResponse\022\020\n\bs2c_code\030\001 \002(\005\022", "\017\n\007s2c_msg\030\002 \001(\t\022\020\n\bs2c_star\030\003 \001(\005\022<\n\020s2c_intimacyData\030\004 \001(\0132\".pomelo.area.GoddessIntimacyStruct\022:\n\017s2c_upGradeInfo\030\005 \001(\0132!.pomelo.area.GoddessUpgradeStruct\"¿\001\n\016UpStarResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022\020\n\bs2c_star\030\003 \001(\005\022<\n\020s2c_intimacyData\030\004 \001(\0132\".pomelo.area.GoddessIntimacyStruct\022:\n\017s2c_upGradeInfo\030\005 \001(\0132!.pomelo.area.GoddessUpgradeStruct\"n\n\030GetGoddessDetailResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007", "s2c_msg\030\002 \001(\t\022/\n\013s2c_goddess\030\003 \001(\0132\032.pomelo.area.GoddessDetail\"\001\n\025GetAllGoddessResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022\035\n\025s2c_on_battle_max_num\030\003 \002(\005\0220\n\rs2c_goddesses\030\004 \003(\0132\031.pomelo.area.GoddessBasic\"~\n\013GoddessGift\022\n\n\002id\030\001 \002(\005\022\r\n\005price\030\002 \002(\005\022\f\n\004name\030\003 \002(\t\022\013\n\003pic\030\004 \002(\t\022\013\n\003des\030\005 \002(\t\022,\n\005basic\030\006 \002(\0132\035.pomelo.area.GoddessGiftBasic\"<\n\020GoddessGiftBasic\022\013\n\003pos\030\001 \002(\005\022\f\n\004show\030\002 \002(\t\022\r\n\005state\030\003 \002(\005\"E\n\fGo", "ddessSkill\022\f\n\004name\030\001 \002(\t\022\013\n\003pic\030\002 \002(\t\022\013\n\003des\030\003 \002(\t\022\r\n\005level\030\004 \002(\005\"¡\002\n\fGoddessBasic\022\n\n\002id\030\001 \002(\005\022\022\n\ntemplateId\030\002 \002(\005\022\f\n\004name\030\003 \002(\t\022\r\n\005state\030\004 \002(\005\022\f\n\004star\030\005 \002(\005\022\020\n\bintimacy\030\006 \002(\005\022\025\n\rintimacyLevel\030\007 \002(\005\022\025\n\rintimacyStage\030\b \002(\005\022\023\n\013actionCount\030\t \002(\005\022\025\n\rupStarItemCur\030\n \002(\005\022\025\n\rupStarItemMax\030\013 \002(\005\022\024\n\fneedIntimacy\030\f \002(\005\022-\n\006equips\030\r \003(\0132\035.pomelo.area.GoddessGiftBasic\"2\n\023GoddessEffectStruct\022\f\n\004name\030\001 \002(\t\022\r\n\005va", "lue\030\002 \002(\005\"Ç\001\n\rGoddessDetail\022(\n\005basic\030\001 \002(\0132\031.pomelo.area.GoddessBasic\022.\n\004atts\030\002 \003(\0132 .pomelo.area.GoddessEffectStruct\022,\n\tmainSkill\030\003 \001(\0132\031.pomelo.area.GoddessSkill\022.\n\013assistSkill\030\004 \001(\0132\031.pomelo.area.GoddessSkill\">\n\031EnterGoddessSceneResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"<\n\027OutGoddessSceneResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\":\n\025ActiveGoddessResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"<\n", "\027OnBattleGoddessResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"=\n\030OffBattleGoddessResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"s\n\027GoddessEquipDynamicPush\022\020\n\bs2c_code\030\001 \002(\005\022\025\n\rs2c_goddessId\030\002 \002(\005\022/\n\bs2c_data\030\003 \003(\0132\035.pomelo.area.GoddessGiftBasic\"m\n\026GoddessGiftDynamicPush\022\020\n\bs2c_code\030\001 \002(\005\022\025\n\rs2c_goddessId\030\002 \002(\005\022*\n\bs2c_data\030\003 \003(\0132\030.pomelo.area.GoddessGift2\n\n\016goddessHandler\022i\n\030enterGoddessSceneRequest\022%.", "pomelo.area.EnterGoddessSceneRequest\032&.pomelo.area.EnterGoddessSceneResponse\022c\n\026outGoddessSceneRequest\022#.pomelo.area.OutGoddessSceneRequest\032$.pomelo.area.OutGoddessSceneResponse\022]\n\024activeGoddessRequest\022!.pomelo.area.ActiveGoddessRequest\032\".pomelo.area.ActiveGoddessResponse\022c\n\026onBattleGoddessRequest\022#.pomelo.area.OnBattleGoddessRequest\032$.pomelo.area.OnBattleGoddessResponse\022f\n\027offBattleGoddessRequest", "\022$.pomelo.area.OffBattleGoddessRequest\032%.pomelo.area.OffBattleGoddessResponse\022N\n\017getGiftsRequest\022\034.pomelo.area.GetGiftsRequest\032\035.pomelo.area.GetGiftsResponse\022K\n\016buyGiftRequest\022\033.pomelo.area.BuyGiftRequest\032\034.pomelo.area.BuyGiftResponse\022W\n\022unEquipGiftRequest\022\037.pomelo.area.UnEquipGiftRequest\032 .pomelo.area.UnEquipGiftResponse\022Q\n\020equipGiftRequest\022\035.pomelo.area.EquipGiftRequest\032\036.pomelo.area.EquipGiftRe", "sponse\022T\n\021upIntimacyRequest\022\036.pomelo.area.UpIntimacyRequest\032\037.pomelo.area.UpIntimacyResponse\022H\n\rupStarRequest\022\032.pomelo.area.UpStarRequest\032\033.pomelo.area.UpStarResponse\022W\n\022getCommInfoRequest\022\037.pomelo.area.GetCommInfoRequest\032 .pomelo.area.GetCommInfoResponse\022f\n\027getGoddessDetailRequest\022$.pomelo.area.GetGoddessDetailRequest\032%.pomelo.area.GetGoddessDetailResponse\022]\n\024getAllGoddessRequest\022!.pomelo.area.Ge", "tAllGoddessRequest\032\".pomelo.area.GetAllGoddessResponse2©\001\n\013goddessPush\022M\n\027goddessEquipDynamicPush\022$.pomelo.area.GoddessEquipDynamicPush\032\f.pomelo.Void\022K\n\026goddessGiftDynamicPush\022#.pomelo.area.GoddessGiftDynamicPush\032\f.pomelo.Void"};


        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                GoddessHandler.descriptor = root;
                return null;
            }
        };

        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{

                Common.getDescriptor()}, assigner);
    }

    private static final Descriptors.Descriptor internal_static_pomelo_area_EnterGoddessSceneRequest_descriptor = getDescriptor().getMessageTypes().get(0);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_EnterGoddessSceneRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_EnterGoddessSceneRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_OutGoddessSceneRequest_descriptor = getDescriptor().getMessageTypes().get(1);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OutGoddessSceneRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OutGoddessSceneRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_ActiveGoddessRequest_descriptor = getDescriptor().getMessageTypes().get(2);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ActiveGoddessRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ActiveGoddessRequest_descriptor, new String[]{"C2SGoddessTemplateId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OnBattleGoddessRequest_descriptor = getDescriptor().getMessageTypes().get(3);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OnBattleGoddessRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OnBattleGoddessRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OffBattleGoddessRequest_descriptor = getDescriptor().getMessageTypes().get(4);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OffBattleGoddessRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OffBattleGoddessRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGiftsRequest_descriptor = getDescriptor().getMessageTypes().get(5);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGiftsRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGiftsRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_BuyGiftRequest_descriptor = getDescriptor().getMessageTypes().get(6);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_BuyGiftRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_BuyGiftRequest_descriptor, new String[]{"C2SGoddessId", "C2SGiftId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UnEquipGiftRequest_descriptor = getDescriptor().getMessageTypes().get(7);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UnEquipGiftRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UnEquipGiftRequest_descriptor, new String[]{"C2SGoddessId", "C2SGiftId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_EquipGiftRequest_descriptor = getDescriptor().getMessageTypes().get(8);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_EquipGiftRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_EquipGiftRequest_descriptor, new String[]{"C2SGoddessId", "C2SGiftId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UpIntimacyRequest_descriptor = getDescriptor().getMessageTypes().get(9);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UpIntimacyRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UpIntimacyRequest_descriptor, new String[]{"C2SGoddessId", "C2SType"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UpStarRequest_descriptor = getDescriptor().getMessageTypes().get(10);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UpStarRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UpStarRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetCommInfoRequest_descriptor = getDescriptor().getMessageTypes().get(11);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetCommInfoRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetCommInfoRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGoddessDetailRequest_descriptor = getDescriptor().getMessageTypes().get(12);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGoddessDetailRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGoddessDetailRequest_descriptor, new String[]{"C2SGoddessId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetAllGoddessRequest_descriptor = getDescriptor().getMessageTypes().get(13);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetAllGoddessRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetAllGoddessRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGiftsResponse_descriptor = getDescriptor().getMessageTypes().get(14);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGiftsResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGiftsResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2CGifts"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_BuyGiftResponse_descriptor = getDescriptor().getMessageTypes().get(15);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_BuyGiftResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_BuyGiftResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UnEquipGiftResponse_descriptor = getDescriptor().getMessageTypes().get(16);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UnEquipGiftResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UnEquipGiftResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_EquipGiftResponse_descriptor = getDescriptor().getMessageTypes().get(17);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_EquipGiftResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_EquipGiftResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessAddProp_descriptor = getDescriptor().getMessageTypes().get(18);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessAddProp_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessAddProp_descriptor, new String[]{"Name", "AddValue"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessUpgradeStruct_descriptor = getDescriptor().getMessageTypes().get(19);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessUpgradeStruct_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessUpgradeStruct_descriptor, new String[]{"ActionCount", "AddProps", "Skill"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessIntimacyStruct_descriptor = getDescriptor().getMessageTypes().get(20);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessIntimacyStruct_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessIntimacyStruct_descriptor, new String[]{"Intimacy", "IntimacyLevel", "IntimacyStage", "NeedIntimacy"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_CommInfo_descriptor = getDescriptor().getMessageTypes().get(21);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_CommInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_CommInfo_descriptor, new String[]{"Type", "Exp", "Cost", "Name"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessCommStruct_descriptor = getDescriptor().getMessageTypes().get(22);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessCommStruct_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessCommStruct_descriptor, new String[]{"CurCommCount", "MaxCommCount", "CommInfo"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetCommInfoResponse_descriptor = getDescriptor().getMessageTypes().get(23);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetCommInfoResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetCommInfoResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2CCommData"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UpIntimacyResponse_descriptor = getDescriptor().getMessageTypes().get(24);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UpIntimacyResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UpIntimacyResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2CStar", "S2CIntimacyData", "S2CUpGradeInfo"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_UpStarResponse_descriptor = getDescriptor().getMessageTypes().get(25);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_UpStarResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_UpStarResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2CStar", "S2CIntimacyData", "S2CUpGradeInfo"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGoddessDetailResponse_descriptor = getDescriptor().getMessageTypes().get(26);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGoddessDetailResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGoddessDetailResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2CGoddess"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetAllGoddessResponse_descriptor = getDescriptor().getMessageTypes().get(27);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetAllGoddessResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetAllGoddessResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "S2COnBattleMaxNum", "S2CGoddesses"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessGift_descriptor = getDescriptor().getMessageTypes().get(28);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessGift_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessGift_descriptor, new String[]{"Id", "Price", "Name", "Pic", "Des", "Basic"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessGiftBasic_descriptor = getDescriptor().getMessageTypes().get(29);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessGiftBasic_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessGiftBasic_descriptor, new String[]{"Pos", "Show", "State"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessSkill_descriptor = getDescriptor().getMessageTypes().get(30);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessSkill_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessSkill_descriptor, new String[]{"Name", "Pic", "Des", "Level"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessBasic_descriptor = getDescriptor().getMessageTypes().get(31);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessBasic_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessBasic_descriptor, new String[]{"Id", "TemplateId", "Name", "State", "Star", "Intimacy", "IntimacyLevel", "IntimacyStage", "ActionCount", "UpStarItemCur", "UpStarItemMax", "NeedIntimacy", "Equips"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessEffectStruct_descriptor = getDescriptor().getMessageTypes().get(32);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessEffectStruct_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessEffectStruct_descriptor, new String[]{"Name", "Value"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessDetail_descriptor = getDescriptor().getMessageTypes().get(33);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessDetail_descriptor, new String[]{"Basic", "Atts", "MainSkill", "AssistSkill"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_EnterGoddessSceneResponse_descriptor = getDescriptor().getMessageTypes().get(34);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_EnterGoddessSceneResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_EnterGoddessSceneResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OutGoddessSceneResponse_descriptor = getDescriptor().getMessageTypes().get(35);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OutGoddessSceneResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OutGoddessSceneResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ActiveGoddessResponse_descriptor = getDescriptor().getMessageTypes().get(36);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ActiveGoddessResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ActiveGoddessResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OnBattleGoddessResponse_descriptor = getDescriptor().getMessageTypes().get(37);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OnBattleGoddessResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OnBattleGoddessResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OffBattleGoddessResponse_descriptor = getDescriptor().getMessageTypes().get(38);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OffBattleGoddessResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OffBattleGoddessResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessEquipDynamicPush_descriptor = getDescriptor().getMessageTypes().get(39);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessEquipDynamicPush_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessEquipDynamicPush_descriptor, new String[]{"S2CCode", "S2CGoddessId", "S2CData"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GoddessGiftDynamicPush_descriptor = getDescriptor().getMessageTypes().get(40);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GoddessGiftDynamicPush_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GoddessGiftDynamicPush_descriptor, new String[]{"S2CCode", "S2CGoddessId", "S2CData"});
    private static Descriptors.FileDescriptor descriptor;

    static {
        Common.getDescriptor();
    }

    public static interface GoddessGiftDynamicPushOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CGoddessId();

        int getS2CGoddessId();

        List<GoddessHandler.GoddessGift> getS2CDataList();

        GoddessHandler.GoddessGift getS2CData(int param1Int);

        int getS2CDataCount();

        List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CDataOrBuilderList();

        GoddessHandler.GoddessGiftOrBuilder getS2CDataOrBuilder(int param1Int);
    }

    public static interface GoddessEquipDynamicPushOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CGoddessId();

        int getS2CGoddessId();

        List<GoddessHandler.GoddessGiftBasic> getS2CDataList();

        GoddessHandler.GoddessGiftBasic getS2CData(int param1Int);

        int getS2CDataCount();

        List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getS2CDataOrBuilderList();

        GoddessHandler.GoddessGiftBasicOrBuilder getS2CDataOrBuilder(int param1Int);
    }

    public static interface OffBattleGoddessResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface OnBattleGoddessResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface ActiveGoddessResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface OutGoddessSceneResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface EnterGoddessSceneResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface GoddessDetailOrBuilder extends MessageOrBuilder {
        boolean hasBasic();

        GoddessHandler.GoddessBasic getBasic();

        GoddessHandler.GoddessBasicOrBuilder getBasicOrBuilder();

        List<GoddessHandler.GoddessEffectStruct> getAttsList();

        GoddessHandler.GoddessEffectStruct getAtts(int param1Int);

        int getAttsCount();

        List<? extends GoddessHandler.GoddessEffectStructOrBuilder> getAttsOrBuilderList();

        GoddessHandler.GoddessEffectStructOrBuilder getAttsOrBuilder(int param1Int);

        boolean hasMainSkill();

        GoddessHandler.GoddessSkill getMainSkill();

        GoddessHandler.GoddessSkillOrBuilder getMainSkillOrBuilder();

        boolean hasAssistSkill();

        GoddessHandler.GoddessSkill getAssistSkill();

        GoddessHandler.GoddessSkillOrBuilder getAssistSkillOrBuilder();
    }

    public static interface GoddessEffectStructOrBuilder extends MessageOrBuilder {
        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasValue();

        int getValue();
    }

    public static interface GoddessBasicOrBuilder extends MessageOrBuilder {
        boolean hasId();

        int getId();

        boolean hasTemplateId();

        int getTemplateId();

        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasState();

        int getState();

        boolean hasStar();

        int getStar();

        boolean hasIntimacy();

        int getIntimacy();

        boolean hasIntimacyLevel();

        int getIntimacyLevel();

        boolean hasIntimacyStage();

        int getIntimacyStage();

        boolean hasActionCount();

        int getActionCount();

        boolean hasUpStarItemCur();

        int getUpStarItemCur();

        boolean hasUpStarItemMax();

        int getUpStarItemMax();

        boolean hasNeedIntimacy();

        int getNeedIntimacy();

        List<GoddessHandler.GoddessGiftBasic> getEquipsList();

        GoddessHandler.GoddessGiftBasic getEquips(int param1Int);

        int getEquipsCount();

        List<? extends GoddessHandler.GoddessGiftBasicOrBuilder> getEquipsOrBuilderList();

        GoddessHandler.GoddessGiftBasicOrBuilder getEquipsOrBuilder(int param1Int);
    }

    public static interface GoddessSkillOrBuilder extends MessageOrBuilder {
        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasPic();

        String getPic();

        ByteString getPicBytes();

        boolean hasDes();

        String getDes();

        ByteString getDesBytes();

        boolean hasLevel();

        int getLevel();
    }

    public static interface GoddessGiftBasicOrBuilder extends MessageOrBuilder {
        boolean hasPos();

        int getPos();

        boolean hasShow();

        String getShow();

        ByteString getShowBytes();

        boolean hasState();

        int getState();
    }

    public static interface GoddessGiftOrBuilder extends MessageOrBuilder {
        boolean hasId();

        int getId();

        boolean hasPrice();

        int getPrice();

        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasPic();

        String getPic();

        ByteString getPicBytes();

        boolean hasDes();

        String getDes();

        ByteString getDesBytes();

        boolean hasBasic();

        GoddessHandler.GoddessGiftBasic getBasic();

        GoddessHandler.GoddessGiftBasicOrBuilder getBasicOrBuilder();
    }

    public static interface GetAllGoddessResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasS2COnBattleMaxNum();

        int getS2COnBattleMaxNum();

        List<GoddessHandler.GoddessBasic> getS2CGoddessesList();

        GoddessHandler.GoddessBasic getS2CGoddesses(int param1Int);

        int getS2CGoddessesCount();

        List<? extends GoddessHandler.GoddessBasicOrBuilder> getS2CGoddessesOrBuilderList();

        GoddessHandler.GoddessBasicOrBuilder getS2CGoddessesOrBuilder(int param1Int);
    }

    public static interface GetGoddessDetailResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasS2CGoddess();

        GoddessHandler.GoddessDetail getS2CGoddess();

        GoddessHandler.GoddessDetailOrBuilder getS2CGoddessOrBuilder();
    }

    public static interface UpStarResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasS2CStar();

        int getS2CStar();

        boolean hasS2CIntimacyData();

        GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData();

        GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder();

        boolean hasS2CUpGradeInfo();

        GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo();

        GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder();
    }

    public static interface UpIntimacyResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasS2CStar();

        int getS2CStar();

        boolean hasS2CIntimacyData();

        GoddessHandler.GoddessIntimacyStruct getS2CIntimacyData();

        GoddessHandler.GoddessIntimacyStructOrBuilder getS2CIntimacyDataOrBuilder();

        boolean hasS2CUpGradeInfo();

        GoddessHandler.GoddessUpgradeStruct getS2CUpGradeInfo();

        GoddessHandler.GoddessUpgradeStructOrBuilder getS2CUpGradeInfoOrBuilder();
    }

    public static interface GetCommInfoResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasS2CCommData();

        GoddessHandler.GoddessCommStruct getS2CCommData();

        GoddessHandler.GoddessCommStructOrBuilder getS2CCommDataOrBuilder();
    }

    public static interface GoddessCommStructOrBuilder extends MessageOrBuilder {
        boolean hasCurCommCount();

        int getCurCommCount();

        boolean hasMaxCommCount();

        int getMaxCommCount();

        List<GoddessHandler.CommInfo> getCommInfoList();

        GoddessHandler.CommInfo getCommInfo(int param1Int);

        int getCommInfoCount();

        List<? extends GoddessHandler.CommInfoOrBuilder> getCommInfoOrBuilderList();

        GoddessHandler.CommInfoOrBuilder getCommInfoOrBuilder(int param1Int);
    }

    public static interface CommInfoOrBuilder extends MessageOrBuilder {
        boolean hasType();

        int getType();

        boolean hasExp();

        int getExp();

        boolean hasCost();

        int getCost();

        boolean hasName();

        String getName();

        ByteString getNameBytes();
    }

    public static interface GoddessIntimacyStructOrBuilder extends MessageOrBuilder {
        boolean hasIntimacy();

        int getIntimacy();

        boolean hasIntimacyLevel();

        int getIntimacyLevel();

        boolean hasIntimacyStage();

        int getIntimacyStage();

        boolean hasNeedIntimacy();

        int getNeedIntimacy();
    }

    public static interface GoddessUpgradeStructOrBuilder extends MessageOrBuilder {
        boolean hasActionCount();

        int getActionCount();

        List<GoddessHandler.GoddessAddProp> getAddPropsList();

        GoddessHandler.GoddessAddProp getAddProps(int param1Int);

        int getAddPropsCount();

        List<? extends GoddessHandler.GoddessAddPropOrBuilder> getAddPropsOrBuilderList();

        GoddessHandler.GoddessAddPropOrBuilder getAddPropsOrBuilder(int param1Int);

        boolean hasSkill();

        GoddessHandler.GoddessSkill getSkill();

        GoddessHandler.GoddessSkillOrBuilder getSkillOrBuilder();
    }

    public static interface GoddessAddPropOrBuilder extends MessageOrBuilder {
        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasAddValue();

        int getAddValue();
    }

    public static interface EquipGiftResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface UnEquipGiftResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface BuyGiftResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface GetGiftsResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<GoddessHandler.GoddessGift> getS2CGiftsList();

        GoddessHandler.GoddessGift getS2CGifts(int param1Int);

        int getS2CGiftsCount();

        List<? extends GoddessHandler.GoddessGiftOrBuilder> getS2CGiftsOrBuilderList();

        GoddessHandler.GoddessGiftOrBuilder getS2CGiftsOrBuilder(int param1Int);
    }

    public static interface GetAllGoddessRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface GetGoddessDetailRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface GetCommInfoRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface UpStarRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface UpIntimacyRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();

        boolean hasC2SType();

        int getC2SType();
    }

    public static interface EquipGiftRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();

        boolean hasC2SGiftId();

        int getC2SGiftId();
    }

    public static interface UnEquipGiftRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();

        boolean hasC2SGiftId();

        int getC2SGiftId();
    }

    public static interface BuyGiftRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();

        boolean hasC2SGiftId();

        int getC2SGiftId();
    }

    public static interface GetGiftsRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface OffBattleGoddessRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface OnBattleGoddessRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessId();

        int getC2SGoddessId();
    }

    public static interface ActiveGoddessRequestOrBuilder extends MessageOrBuilder {
        boolean hasC2SGoddessTemplateId();

        int getC2SGoddessTemplateId();
    }

    public static interface OutGoddessSceneRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface EnterGoddessSceneRequestOrBuilder extends MessageOrBuilder {
    }
}


