.class public final synthetic Lax/a1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/p;->q:Lax/a1/z$a;

    iput p2, p0, Lax/a1/p;->c0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/p;->q:Lax/a1/z$a;

    iget v1, p0, Lax/a1/p;->c0:I

    invoke-static {v0, v1}, Lax/a1/z$a;->j(Lax/a1/z$a;I)V

    return-void
.end method
