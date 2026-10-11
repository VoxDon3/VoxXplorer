.class public Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/OneDriveFileHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field a:Ljava/io/InputStream;

.field b:J

.field c:Lax/u3/c;

.field d:Lax/L9/e;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;JLax/u3/c;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->a:Ljava/io/InputStream;

    .line 3
    iput-wide p2, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->b:J

    .line 4
    iput-object p4, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->c:Lax/u3/c;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;JLax/u3/c;Lax/L9/e;)V
    .registers 6

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->a:Ljava/io/InputStream;

    .line 7
    iput-wide p2, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->b:J

    .line 8
    iput-object p4, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->c:Lax/u3/c;

    .line 9
    iput-object p5, p0, Lcom/voxdon/xplorer/file/OneDriveFileHelper$i;->d:Lax/L9/e;

    return-void
.end method
