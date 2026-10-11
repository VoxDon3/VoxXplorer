.class public final synthetic Lax/N1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/l;


# instance fields
.field public final synthetic a:Lax/r7/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/r7/z$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/N1/r;->a:Lax/r7/z$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/N1/r;->a:Lax/r7/z$a;

    check-cast p1, Lax/N1/e;

    invoke-virtual {v0, p1}, Lax/r7/z$a;->h(Ljava/lang/Object;)Lax/r7/z$a;

    return-void
.end method
