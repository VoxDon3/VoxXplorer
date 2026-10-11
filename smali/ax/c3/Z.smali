.class public final synthetic Lax/c3/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/la/r;


# instance fields
.field public final synthetic q:Lax/g3/i;


# direct methods
.method public synthetic constructor <init>(Lax/g3/i;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/c3/Z;->q:Lax/g3/i;

    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c3/Z;->q:Lax/g3/i;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/I;->k0(Lax/g3/i;JJ)V

    return-void
.end method
