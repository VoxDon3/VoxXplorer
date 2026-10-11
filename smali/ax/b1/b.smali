.class public final synthetic Lax/b1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lax/b1/b;->a:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget v0, p0, Lax/b1/b;->a:I

    check-cast p1, Lax/b1/u$a;

    invoke-static {v0, p1}, Lax/b1/g;->j(ILax/b1/u$a;)V

    return-void
.end method
